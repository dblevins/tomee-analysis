package asm.org.apache.cxf.transport.http.auth;
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
public class DigestAuthSupplier$DigestInfoDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/transport/http/auth/DigestAuthSupplier$DigestInfo", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/cxf/transport/http/auth/DigestAuthSupplier$DigestInfo", "org/apache/cxf/transport/http/auth/DigestAuthSupplier", "DigestInfo", 0);

{
fieldVisitor = classWriter.visitField(0, "qop", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "realm", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "nonce", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "opaque", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "nc", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "algorithm", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "charset", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "method", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/cxf/transport/http/auth/DigestAuthSupplier;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/transport/http/auth/DigestAuthSupplier;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/transport/http/auth/DigestAuthSupplier$DigestInfo", "this$0", "Lorg/apache/cxf/transport/http/auth/DigestAuthSupplier;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("MD5");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/transport/http/auth/DigestAuthSupplier$DigestInfo", "algorithm", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("ISO-8859-1");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/transport/http/auth/DigestAuthSupplier$DigestInfo", "charset", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("POST");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/transport/http/auth/DigestAuthSupplier$DigestInfo", "method", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNCHRONIZED, "generateAuth", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/auth/DigestAuthSupplier$DigestInfo", "nc", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/transport/http/auth/DigestAuthSupplier$DigestInfo", "nc", "I");
methodVisitor.visitLdcInsn("%08d");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/auth/DigestAuthSupplier$DigestInfo", "nc", "I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "format", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/auth/DigestAuthSupplier$DigestInfo", "this$0", "Lorg/apache/cxf/transport/http/auth/DigestAuthSupplier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/http/auth/DigestAuthSupplier", "createCnonce", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/auth/DigestAuthSupplier$DigestInfo", "algorithm", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLdcInsn("MD5-sess");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equalsIgnoreCase", "(Ljava/lang/String;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitLdcInsn("MD5");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"java/lang/String", "java/lang/String", "java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/MessageDigest", "getInstance", "(Ljava/lang/String;)Ljava/security/MessageDigest;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(":");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/auth/DigestAuthSupplier$DigestInfo", "realm", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(":");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitLdcInsn("MD5-sess");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/auth/DigestAuthSupplier$DigestInfo", "algorithm", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equalsIgnoreCase", "(Ljava/lang/String;)Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/auth/DigestAuthSupplier$DigestInfo", "charset", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "getBytes", "(Ljava/lang/String;)[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/MessageDigest", "digest", "([B)[B", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/transport/http/auth/DigestAuthSupplier", "access$000", "([B)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitIntInsn(BIPUSH, 58);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(C)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/auth/DigestAuthSupplier$DigestInfo", "nonce", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitIntInsn(BIPUSH, 58);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(C)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/security/MessageDigest", "java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/auth/DigestAuthSupplier$DigestInfo", "charset", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "getBytes", "(Ljava/lang/String;)[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/MessageDigest", "digest", "([B)[B", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/transport/http/auth/DigestAuthSupplier", "access$000", "([B)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/auth/DigestAuthSupplier$DigestInfo", "method", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(":");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitLdcInsn("US-ASCII");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "getBytes", "(Ljava/lang/String;)[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/MessageDigest", "digest", "([B)[B", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/transport/http/auth/DigestAuthSupplier", "access$000", "([B)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/auth/DigestAuthSupplier$DigestInfo", "qop", "Ljava/lang/String;");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label5);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(":");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/auth/DigestAuthSupplier$DigestInfo", "nonce", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(":");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 12);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 13, new Object[] {"org/apache/cxf/transport/http/auth/DigestAuthSupplier$DigestInfo", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", "java/security/MessageDigest", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String"}, 0, new Object[] {});
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(":");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/auth/DigestAuthSupplier$DigestInfo", "nonce", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(":");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(":");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(":");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/auth/DigestAuthSupplier$DigestInfo", "qop", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(":");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitLdcInsn("US-ASCII");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "getBytes", "(Ljava/lang/String;)[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/MessageDigest", "digest", "([B)[B", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/transport/http/auth/DigestAuthSupplier", "access$000", "([B)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 13);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 14);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/auth/DigestAuthSupplier$DigestInfo", "qop", "Ljava/lang/String;");
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitLdcInsn("qop");
methodVisitor.visitLdcInsn("auth");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/String", "java/util/Map"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitLdcInsn("realm");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/auth/DigestAuthSupplier$DigestInfo", "realm", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitLdcInsn("opaque");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/auth/DigestAuthSupplier$DigestInfo", "opaque", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitLdcInsn("nonce");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/auth/DigestAuthSupplier$DigestInfo", "nonce", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitLdcInsn("uri");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitLdcInsn("username");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitLdcInsn("nc");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitLdcInsn("cnonce");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitLdcInsn("response");
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitLdcInsn("algorithm");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/auth/DigestAuthSupplier$DigestInfo", "algorithm", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/transport/http/auth/HttpAuthHeader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Digest");
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/transport/http/auth/HttpAuthHeader", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/http/auth/HttpAuthHeader", "getFullHeader", "()Ljava/lang/String;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/cxf/transport/http/auth/DigestAuthSupplier$DigestInfo", "java/lang/String", "java/lang/String", "java/lang/String"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "java/lang/RuntimeException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/RuntimeException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(5, 15);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
