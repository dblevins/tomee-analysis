package asm.org.apache.myfaces.shared.util;
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
public class RequestTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/myfaces/shared/util/RequestType", "Ljava/lang/Enum<Lorg/apache/myfaces/shared/util/RequestType;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SERVLET", "Lorg/apache/myfaces/shared/util/RequestType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "RENDER", "Lorg/apache/myfaces/shared/util/RequestType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ACTION", "Lorg/apache/myfaces/shared/util/RequestType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "RESOURCE", "Lorg/apache/myfaces/shared/util/RequestType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EVENT", "Lorg/apache/myfaces/shared/util/RequestType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_client", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_writable", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_portlet", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/myfaces/shared/util/RequestType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/myfaces/shared/util/RequestType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/util/RequestType", "$VALUES", "[Lorg/apache/myfaces/shared/util/RequestType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/myfaces/shared/util/RequestType;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/myfaces/shared/util/RequestType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/myfaces/shared/util/RequestType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/myfaces/shared/util/RequestType;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/myfaces/shared/util/RequestType");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;IZZZ)V", "(ZZZ)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/shared/util/RequestType", "_client", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/shared/util/RequestType", "_writable", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/shared/util/RequestType", "_portlet", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isRequestFromClient", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/util/RequestType", "_client", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isResponseWritable", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/util/RequestType", "_writable", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isPortlet", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/util/RequestType", "_portlet", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/shared/util/RequestType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SERVLET");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/shared/util/RequestType", "<init>", "(Ljava/lang/String;IZZZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/util/RequestType", "SERVLET", "Lorg/apache/myfaces/shared/util/RequestType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/shared/util/RequestType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RENDER");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/shared/util/RequestType", "<init>", "(Ljava/lang/String;IZZZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/util/RequestType", "RENDER", "Lorg/apache/myfaces/shared/util/RequestType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/shared/util/RequestType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ACTION");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/shared/util/RequestType", "<init>", "(Ljava/lang/String;IZZZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/util/RequestType", "ACTION", "Lorg/apache/myfaces/shared/util/RequestType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/shared/util/RequestType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RESOURCE");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/shared/util/RequestType", "<init>", "(Ljava/lang/String;IZZZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/util/RequestType", "RESOURCE", "Lorg/apache/myfaces/shared/util/RequestType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/shared/util/RequestType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EVENT");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/shared/util/RequestType", "<init>", "(Ljava/lang/String;IZZZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/util/RequestType", "EVENT", "Lorg/apache/myfaces/shared/util/RequestType;");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/myfaces/shared/util/RequestType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/util/RequestType", "SERVLET", "Lorg/apache/myfaces/shared/util/RequestType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/util/RequestType", "RENDER", "Lorg/apache/myfaces/shared/util/RequestType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/util/RequestType", "ACTION", "Lorg/apache/myfaces/shared/util/RequestType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/util/RequestType", "RESOURCE", "Lorg/apache/myfaces/shared/util/RequestType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/util/RequestType", "EVENT", "Lorg/apache/myfaces/shared/util/RequestType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/util/RequestType", "$VALUES", "[Lorg/apache/myfaces/shared/util/RequestType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
