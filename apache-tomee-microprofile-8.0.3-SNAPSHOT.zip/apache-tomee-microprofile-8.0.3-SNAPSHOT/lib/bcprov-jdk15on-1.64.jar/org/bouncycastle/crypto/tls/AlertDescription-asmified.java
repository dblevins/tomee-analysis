package asm.org.bouncycastle.crypto.tls;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.RecordComponentVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;
public class AlertDescriptionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER | ACC_DEPRECATED, "org/bouncycastle/crypto/tls/AlertDescription", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "close_notify", "S", null, new Integer(0));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "unexpected_message", "S", null, new Integer(10));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "bad_record_mac", "S", null, new Integer(20));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "decryption_failed", "S", null, new Integer(21));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "record_overflow", "S", null, new Integer(22));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "decompression_failure", "S", null, new Integer(30));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "handshake_failure", "S", null, new Integer(40));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "no_certificate", "S", null, new Integer(41));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "bad_certificate", "S", null, new Integer(42));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "unsupported_certificate", "S", null, new Integer(43));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "certificate_revoked", "S", null, new Integer(44));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "certificate_expired", "S", null, new Integer(45));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "certificate_unknown", "S", null, new Integer(46));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "illegal_parameter", "S", null, new Integer(47));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "unknown_ca", "S", null, new Integer(48));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "access_denied", "S", null, new Integer(49));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "decode_error", "S", null, new Integer(50));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "decrypt_error", "S", null, new Integer(51));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "export_restriction", "S", null, new Integer(60));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "protocol_version", "S", null, new Integer(70));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "insufficient_security", "S", null, new Integer(71));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "internal_error", "S", null, new Integer(80));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "user_canceled", "S", null, new Integer(90));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "no_renegotiation", "S", null, new Integer(100));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "unsupported_extension", "S", null, new Integer(110));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "certificate_unobtainable", "S", null, new Integer(111));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "unrecognized_name", "S", null, new Integer(112));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "bad_certificate_status_response", "S", null, new Integer(113));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "bad_certificate_hash_value", "S", null, new Integer(114));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "unknown_psk_identity", "S", null, new Integer(115));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "inappropriate_fallback", "S", null, new Integer(86));
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getName", "(S)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
Label label6 = new Label();
Label label7 = new Label();
Label label8 = new Label();
Label label9 = new Label();
Label label10 = new Label();
Label label11 = new Label();
Label label12 = new Label();
Label label13 = new Label();
Label label14 = new Label();
Label label15 = new Label();
Label label16 = new Label();
Label label17 = new Label();
Label label18 = new Label();
Label label19 = new Label();
Label label20 = new Label();
Label label21 = new Label();
Label label22 = new Label();
Label label23 = new Label();
Label label24 = new Label();
Label label25 = new Label();
Label label26 = new Label();
Label label27 = new Label();
Label label28 = new Label();
Label label29 = new Label();
Label label30 = new Label();
Label label31 = new Label();
methodVisitor.visitTableSwitchInsn(0, 115, label1, new Label[] { label0, label1, label1, label1, label1, label1, label1, label1, label1, label1, label2, label1, label1, label1, label1, label1, label1, label1, label1, label1, label3, label4, label5, label1, label1, label1, label1, label1, label1, label1, label6, label1, label1, label1, label1, label1, label1, label1, label1, label1, label7, label8, label9, label10, label11, label12, label13, label14, label15, label16, label17, label18, label1, label1, label1, label1, label1, label1, label1, label1, label19, label1, label1, label1, label1, label1, label1, label1, label1, label1, label20, label21, label1, label1, label1, label1, label1, label1, label1, label1, label22, label1, label1, label1, label1, label1, label23, label1, label1, label1, label24, label1, label1, label1, label1, label1, label1, label1, label1, label1, label25, label1, label1, label1, label1, label1, label1, label1, label1, label1, label26, label27, label28, label29, label30, label31 });
methodVisitor.visitLabel(label0);
methodVisitor.visitLdcInsn("close_notify");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitLdcInsn("unexpected_message");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitLdcInsn("bad_record_mac");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitLdcInsn("decryption_failed");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitLdcInsn("record_overflow");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitLdcInsn("decompression_failure");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitLdcInsn("handshake_failure");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label8);
methodVisitor.visitLdcInsn("no_certificate");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label9);
methodVisitor.visitLdcInsn("bad_certificate");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label10);
methodVisitor.visitLdcInsn("unsupported_certificate");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label11);
methodVisitor.visitLdcInsn("certificate_revoked");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label12);
methodVisitor.visitLdcInsn("certificate_expired");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label13);
methodVisitor.visitLdcInsn("certificate_unknown");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label14);
methodVisitor.visitLdcInsn("illegal_parameter");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label15);
methodVisitor.visitLdcInsn("unknown_ca");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label16);
methodVisitor.visitLdcInsn("access_denied");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label17);
methodVisitor.visitLdcInsn("decode_error");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label18);
methodVisitor.visitLdcInsn("decrypt_error");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label19);
methodVisitor.visitLdcInsn("export_restriction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label20);
methodVisitor.visitLdcInsn("protocol_version");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label21);
methodVisitor.visitLdcInsn("insufficient_security");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label22);
methodVisitor.visitLdcInsn("internal_error");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label24);
methodVisitor.visitLdcInsn("user_canceled");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label25);
methodVisitor.visitLdcInsn("no_renegotiation");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label26);
methodVisitor.visitLdcInsn("unsupported_extension");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label27);
methodVisitor.visitLdcInsn("certificate_unobtainable");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label28);
methodVisitor.visitLdcInsn("unrecognized_name");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label29);
methodVisitor.visitLdcInsn("bad_certificate_status_response");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label30);
methodVisitor.visitLdcInsn("bad_certificate_hash_value");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label31);
methodVisitor.visitLdcInsn("unknown_psk_identity");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label23);
methodVisitor.visitLdcInsn("inappropriate_fallback");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitLdcInsn("UNKNOWN");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getText", "(S)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/AlertDescription", "getName", "(S)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("(");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(")");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
