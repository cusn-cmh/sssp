package com.xiaoshu.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Operation implements Serializable {
    /**
     * 具体的方法
     */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long operationId;

    /**
     * 方法名
     */
    private String operationName;

    /**
     * 所属菜单
     */
    @ManyToOne(optional = false)
    @JoinColumn(name="menuId")
    private Menu menuId;
    
    private String iconCls;
    
    private String operationCode;

    private static final long serialVersionUID = 1L;

    public Operation() {
    }

	public Long getOperationId() {
		return operationId;
	}

	public void setOperationId(Long operationId) {
		this.operationId = operationId;
	}

	public String getOperationName() {
		return operationName;
	}

	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}

	public Menu getMenuId() {
		return menuId;
	}

	public void setMenuId(Menu menuId) {
		this.menuId = menuId;
	}

	public String getIconCls() {
		return iconCls;
	}

	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}

	public String getOperationCode() {
		return operationCode;
	}

	public void setOperationCode(String operationCode) {
		this.operationCode = operationCode;
	}

}