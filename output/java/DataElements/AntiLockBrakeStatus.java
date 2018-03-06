/*
 * Generated by ASN.1 Java Compiler (http://www.asnlab.org/)
 * From ASN.1 module "DataElements"
 */
package DataElements;

import java.io.*;
import javax.validation.constraints.*;
import org.asnlab.asndt.runtime.conv.*;
import org.asnlab.asndt.runtime.conv.annotation.*;
import org.asnlab.asndt.runtime.type.AsnType;
import org.asnlab.asndt.runtime.value.*;

public enum AntiLockBrakeStatus {
	unavailable(0),
	off(1),
	on(2),
	engaged(3);

	public static AntiLockBrakeStatus valueOf(int value){
		AntiLockBrakeStatus[] values = values();
		for(int i=0;i<values.length;i++){
			if(values[i].value==value){
				return values[i];
			}
		}
		 throw new IllegalArgumentException("No enum const value for " + value);
	}


	private int value;

	private AntiLockBrakeStatus(int value) {
		this.value = value;
	}

	public int value(){
		return value;
	}

	public void ber_encode(OutputStream out) throws IOException {
		TYPE.encode(this, EncodingRules.BASIC_ENCODING_RULES, CONV, out);
	}

	public static AntiLockBrakeStatus ber_decode(InputStream in) throws IOException {
		return (AntiLockBrakeStatus)TYPE.decode(in, EncodingRules.BASIC_ENCODING_RULES, CONV);
	}


	public final static AsnType TYPE = DataElements.type(65540);

	public final static AsnConverter CONV;

	static {
		CONV = new ReflectionEnumeratedConverter(AntiLockBrakeStatus.class);
	}


}
