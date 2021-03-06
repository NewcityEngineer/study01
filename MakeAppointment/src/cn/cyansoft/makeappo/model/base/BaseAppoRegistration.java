package cn.cyansoft.makeappo.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseAppoRegistration<M extends BaseAppoRegistration<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setAppointmentId(java.lang.Integer appointmentId) {
		set("appointmentId", appointmentId);
	}

	public java.lang.Integer getAppointmentId() {
		return get("appointmentId");
	}

	public void setMoney(java.lang.Integer money) {
		set("money", money);
	}

	public java.lang.Integer getMoney() {
		return get("money");
	}

	public void setPayway(java.lang.String payway) {
		set("payway", payway);
	}

	public java.lang.String getPayway() {
		return get("payway");
	}

	public void setTime(java.lang.String time) {
		set("time", time);
	}

	public java.lang.String getTime() {
		return get("time");
	}

	public void setDiagnosis(java.lang.String diagnosis) {
		set("diagnosis", diagnosis);
	}

	public java.lang.String getDiagnosis() {
		return get("diagnosis");
	}

}
