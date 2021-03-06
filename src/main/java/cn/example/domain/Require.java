package cn.example.domain;

import java.io.Serializable;

/**
 * 需求点实体类
 */
public class Require implements Serializable {
    private Integer id;
    private String requirename;
    private Double requirelongitude;
    private Double requirelatitude;
    private Double requirecapacity;

    @Override
    public String toString() {
        return "Require{" +
                "id=" + id +
                ", requirename='" + requirename + '\'' +
                ", requirelongitude=" + requirelongitude +
                ", requirelatitude=" + requirelatitude +
                ", requirecapacity=" + requirecapacity +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRequirename() {
        return requirename;
    }

    public void setRequirename(String requirename) {
        this.requirename = requirename;
    }

    public Double getRequirelongitude() {
        return requirelongitude;
    }

    public void setRequirelongitude(Double requirelongitude) {
        this.requirelongitude = requirelongitude;
    }

    public Double getRequirelatitude() {
        return requirelatitude;
    }

    public void setRequirelatitude(Double requirelatitude) {
        this.requirelatitude = requirelatitude;
    }

    public Double getRequirecapacity() {
        return requirecapacity;
    }

    public void setRequirecapacity(Double requirecapacity) {
        this.requirecapacity = requirecapacity;
    }
}
