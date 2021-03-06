package com.jfinal.weixin.entity;

import java.util.List;

/**
 * @author Javen
 * 公交站
 */
public class GongjiaoBus {
	private String dist;//总距离 米
	private String time;// 分钟
	private String foot_dist;//步行总距离
	private String last_foot_dist;//步行起点站距离
	private List<Segment> list;
	public GongjiaoBus() {
	}
	
	public GongjiaoBus(String dist, String time, String foot_dist,
			String last_foot_dist, List<Segment> list) {
		this.dist = dist;
		this.time = time;
		this.foot_dist = foot_dist;
		this.last_foot_dist = last_foot_dist;
		this.list = list;
	}


	public String getDist() {
		return dist;
	}
	public void setDist(String dist) {
		this.dist = dist;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getFoot_dist() {
		return foot_dist;
	}
	public void setFoot_dist(String foot_dist) {
		this.foot_dist = foot_dist;
	}
	public String getLast_foot_dist() {
		return last_foot_dist;
	}
	public void setLast_foot_dist(String last_foot_dist) {
		this.last_foot_dist = last_foot_dist;
	}
	
	public List<Segment> getList() {
		return list;
	}
	public void setList(List<Segment> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "GongjiaoBus [dist=" + dist + ", time=" + time + ", foot_dist=" + foot_dist + ", last_foot_dist="
				+ last_foot_dist + ", list=" + list + "]";
	}
	
	
	
}
