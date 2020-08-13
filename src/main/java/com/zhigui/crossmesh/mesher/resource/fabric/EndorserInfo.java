package com.zhigui.crossmesh.mesher.resource.fabric;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 * Created by IntelliJ IDEA.
 * Author: kaichen
 * Date: 2020/8/10
 * Time: 3:22 PM
 */
public class EndorserInfo implements Serializable {
    private String id;

    private String mspId;

    private byte[] signature;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMspId() {
        return mspId;
    }

    public void setMspId(String mspId) {
        this.mspId = mspId;
    }

    public byte[] getSignature() {
        return signature;
    }

    public void setSignature(byte[] signature) {
        this.signature = signature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EndorserInfo that = (EndorserInfo) o;
        return id.equals(that.id) &&
            mspId.equals(that.mspId) &&
            Arrays.equals(signature, that.signature);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, mspId);
        result = 31 * result + Arrays.hashCode(signature);
        return result;
    }

    @Override
    public String toString() {
        return "EndorserInfo{" +
            "id='" + id + '\'' +
            ", mspId='" + mspId + '\'' +
            ", signature=" + Arrays.toString(signature) +
            '}';
    }
}
