package asm.org.apache.coyote.http2;
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
public class Http2ErrorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/coyote/http2/Http2Error", "Ljava/lang/Enum<Lorg/apache/coyote/http2/Http2Error;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NO_ERROR", "Lorg/apache/coyote/http2/Http2Error;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PROTOCOL_ERROR", "Lorg/apache/coyote/http2/Http2Error;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INTERNAL_ERROR", "Lorg/apache/coyote/http2/Http2Error;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FLOW_CONTROL_ERROR", "Lorg/apache/coyote/http2/Http2Error;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SETTINGS_TIMEOUT", "Lorg/apache/coyote/http2/Http2Error;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "STREAM_CLOSED", "Lorg/apache/coyote/http2/Http2Error;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FRAME_SIZE_ERROR", "Lorg/apache/coyote/http2/Http2Error;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "REFUSED_STREAM", "Lorg/apache/coyote/http2/Http2Error;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CANCEL", "Lorg/apache/coyote/http2/Http2Error;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "COMPRESSION_ERROR", "Lorg/apache/coyote/http2/Http2Error;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CONNECT_ERROR", "Lorg/apache/coyote/http2/Http2Error;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ENHANCE_YOUR_CALM", "Lorg/apache/coyote/http2/Http2Error;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INADEQUATE_SECURITY", "Lorg/apache/coyote/http2/Http2Error;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "HTTP_1_1_REQUIRED", "Lorg/apache/coyote/http2/Http2Error;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "code", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/coyote/http2/Http2Error;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/coyote/http2/Http2Error;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/Http2Error", "$VALUES", "[Lorg/apache/coyote/http2/Http2Error;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/coyote/http2/Http2Error;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/coyote/http2/Http2Error;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/coyote/http2/Http2Error;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/coyote/http2/Http2Error;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/coyote/http2/Http2Error");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;IJ)V", "(J)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/coyote/http2/Http2Error", "code", "J");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getCode", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/Http2Error", "code", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getCodeBytes", "()[B", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/Http2Error", "code", "J");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/coyote/http2/ByteUtil", "setFourBytes", "([BIJ)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/http2/Http2Error");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NO_ERROR");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/Http2Error", "<init>", "(Ljava/lang/String;IJ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http2/Http2Error", "NO_ERROR", "Lorg/apache/coyote/http2/Http2Error;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/http2/Http2Error");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PROTOCOL_ERROR");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(LCONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/Http2Error", "<init>", "(Ljava/lang/String;IJ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http2/Http2Error", "PROTOCOL_ERROR", "Lorg/apache/coyote/http2/Http2Error;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/http2/Http2Error");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INTERNAL_ERROR");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn(new Long(2L));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/Http2Error", "<init>", "(Ljava/lang/String;IJ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http2/Http2Error", "INTERNAL_ERROR", "Lorg/apache/coyote/http2/Http2Error;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/http2/Http2Error");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FLOW_CONTROL_ERROR");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn(new Long(3L));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/Http2Error", "<init>", "(Ljava/lang/String;IJ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http2/Http2Error", "FLOW_CONTROL_ERROR", "Lorg/apache/coyote/http2/Http2Error;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/http2/Http2Error");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SETTINGS_TIMEOUT");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn(new Long(4L));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/Http2Error", "<init>", "(Ljava/lang/String;IJ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http2/Http2Error", "SETTINGS_TIMEOUT", "Lorg/apache/coyote/http2/Http2Error;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/http2/Http2Error");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("STREAM_CLOSED");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn(new Long(5L));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/Http2Error", "<init>", "(Ljava/lang/String;IJ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http2/Http2Error", "STREAM_CLOSED", "Lorg/apache/coyote/http2/Http2Error;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/http2/Http2Error");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FRAME_SIZE_ERROR");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn(new Long(6L));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/Http2Error", "<init>", "(Ljava/lang/String;IJ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http2/Http2Error", "FRAME_SIZE_ERROR", "Lorg/apache/coyote/http2/Http2Error;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/http2/Http2Error");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("REFUSED_STREAM");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitLdcInsn(new Long(7L));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/Http2Error", "<init>", "(Ljava/lang/String;IJ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http2/Http2Error", "REFUSED_STREAM", "Lorg/apache/coyote/http2/Http2Error;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/http2/Http2Error");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CANCEL");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitLdcInsn(new Long(8L));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/Http2Error", "<init>", "(Ljava/lang/String;IJ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http2/Http2Error", "CANCEL", "Lorg/apache/coyote/http2/Http2Error;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/http2/Http2Error");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("COMPRESSION_ERROR");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitLdcInsn(new Long(9L));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/Http2Error", "<init>", "(Ljava/lang/String;IJ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http2/Http2Error", "COMPRESSION_ERROR", "Lorg/apache/coyote/http2/Http2Error;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/http2/Http2Error");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CONNECT_ERROR");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitLdcInsn(new Long(10L));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/Http2Error", "<init>", "(Ljava/lang/String;IJ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http2/Http2Error", "CONNECT_ERROR", "Lorg/apache/coyote/http2/Http2Error;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/http2/Http2Error");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ENHANCE_YOUR_CALM");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitLdcInsn(new Long(11L));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/Http2Error", "<init>", "(Ljava/lang/String;IJ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http2/Http2Error", "ENHANCE_YOUR_CALM", "Lorg/apache/coyote/http2/Http2Error;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/http2/Http2Error");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INADEQUATE_SECURITY");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitLdcInsn(new Long(12L));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/Http2Error", "<init>", "(Ljava/lang/String;IJ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http2/Http2Error", "INADEQUATE_SECURITY", "Lorg/apache/coyote/http2/Http2Error;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/http2/Http2Error");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HTTP_1_1_REQUIRED");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitLdcInsn(new Long(13L));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/Http2Error", "<init>", "(Ljava/lang/String;IJ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http2/Http2Error", "HTTP_1_1_REQUIRED", "Lorg/apache/coyote/http2/Http2Error;");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/coyote/http2/Http2Error");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/Http2Error", "NO_ERROR", "Lorg/apache/coyote/http2/Http2Error;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/Http2Error", "PROTOCOL_ERROR", "Lorg/apache/coyote/http2/Http2Error;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/Http2Error", "INTERNAL_ERROR", "Lorg/apache/coyote/http2/Http2Error;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/Http2Error", "FLOW_CONTROL_ERROR", "Lorg/apache/coyote/http2/Http2Error;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/Http2Error", "SETTINGS_TIMEOUT", "Lorg/apache/coyote/http2/Http2Error;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/Http2Error", "STREAM_CLOSED", "Lorg/apache/coyote/http2/Http2Error;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/Http2Error", "FRAME_SIZE_ERROR", "Lorg/apache/coyote/http2/Http2Error;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/Http2Error", "REFUSED_STREAM", "Lorg/apache/coyote/http2/Http2Error;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/Http2Error", "CANCEL", "Lorg/apache/coyote/http2/Http2Error;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/Http2Error", "COMPRESSION_ERROR", "Lorg/apache/coyote/http2/Http2Error;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/Http2Error", "CONNECT_ERROR", "Lorg/apache/coyote/http2/Http2Error;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/Http2Error", "ENHANCE_YOUR_CALM", "Lorg/apache/coyote/http2/Http2Error;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/Http2Error", "INADEQUATE_SECURITY", "Lorg/apache/coyote/http2/Http2Error;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/Http2Error", "HTTP_1_1_REQUIRED", "Lorg/apache/coyote/http2/Http2Error;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http2/Http2Error", "$VALUES", "[Lorg/apache/coyote/http2/Http2Error;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
