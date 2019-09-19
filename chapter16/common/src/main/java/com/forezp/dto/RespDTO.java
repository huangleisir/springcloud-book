package com.forezp.dto;

import java.io.Serializable;

/**
 * @author DELL
 */
public class RespDTO<T> implements Serializable{


    private static final long serialVersionUID = 6690094287808237885L;
    public int code = 0;
    public String error = "";
    public T data;

    public static RespDTO onSuc(Object data) {
        RespDTO resp = new RespDTO();
        resp.data = data;
        return resp;
    }

    @Override
    public String toString() {
        return "RespDTO{" +
                "code=" + code +
                ", error='" + error + '\'' +
                ", data=" + data +
                '}';
    }
}
