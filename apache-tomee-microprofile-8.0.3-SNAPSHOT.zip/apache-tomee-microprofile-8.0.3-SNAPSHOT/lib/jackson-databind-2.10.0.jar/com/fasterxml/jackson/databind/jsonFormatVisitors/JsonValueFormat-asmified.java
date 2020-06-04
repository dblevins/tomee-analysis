package asm.com.fasterxml.jackson.databind.jsonFormatVisitors;
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
public class JsonValueFormatDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat", "Ljava/lang/Enum<Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "COLOR", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DATE", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DATE_TIME", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EMAIL", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "HOST_NAME", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "IP_ADDRESS", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "IPV6", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PHONE", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "REGEX", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "STYLE", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TIME", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "URI", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UTC_MILLISEC", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UUID", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "_desc", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat", "$VALUES", "[Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "(Ljava/lang/String;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat", "_desc", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lcom/fasterxml/jackson/annotation/JsonValue;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat", "_desc", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("COLOR");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("color");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat", "COLOR", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DATE");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("date");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat", "DATE", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DATE_TIME");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("date-time");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat", "DATE_TIME", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EMAIL");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("email");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat", "EMAIL", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HOST_NAME");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("host-name");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat", "HOST_NAME", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IP_ADDRESS");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("ip-address");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat", "IP_ADDRESS", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IPV6");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("ipv6");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat", "IPV6", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PHONE");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitLdcInsn("phone");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat", "PHONE", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("REGEX");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitLdcInsn("regex");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat", "REGEX", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("STYLE");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitLdcInsn("style");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat", "STYLE", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TIME");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitLdcInsn("time");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat", "TIME", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("URI");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitLdcInsn("uri");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat", "URI", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UTC_MILLISEC");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitLdcInsn("utc-millisec");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat", "UTC_MILLISEC", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UUID");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitLdcInsn("uuid");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat", "UUID", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat", "COLOR", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat", "DATE", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat", "DATE_TIME", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat", "EMAIL", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat", "HOST_NAME", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat", "IP_ADDRESS", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat", "IPV6", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat", "PHONE", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat", "REGEX", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat", "STYLE", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat", "TIME", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat", "URI", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat", "UTC_MILLISEC", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat", "UUID", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat", "$VALUES", "[Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
