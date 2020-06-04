package asm.org.apache.cxf.jaxrs.ext.search;
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
public class ConditionTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/cxf/jaxrs/ext/search/ConditionType", "Ljava/lang/Enum<Lorg/apache/cxf/jaxrs/ext/search/ConditionType;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EQUALS", "Lorg/apache/cxf/jaxrs/ext/search/ConditionType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NOT_EQUALS", "Lorg/apache/cxf/jaxrs/ext/search/ConditionType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "LESS_THAN", "Lorg/apache/cxf/jaxrs/ext/search/ConditionType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "GREATER_THAN", "Lorg/apache/cxf/jaxrs/ext/search/ConditionType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "LESS_OR_EQUALS", "Lorg/apache/cxf/jaxrs/ext/search/ConditionType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "GREATER_OR_EQUALS", "Lorg/apache/cxf/jaxrs/ext/search/ConditionType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OR", "Lorg/apache/cxf/jaxrs/ext/search/ConditionType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "AND", "Lorg/apache/cxf/jaxrs/ext/search/ConditionType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CUSTOM", "Lorg/apache/cxf/jaxrs/ext/search/ConditionType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/cxf/jaxrs/ext/search/ConditionType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/cxf/jaxrs/ext/search/ConditionType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/jaxrs/ext/search/ConditionType", "$VALUES", "[Lorg/apache/cxf/jaxrs/ext/search/ConditionType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/cxf/jaxrs/ext/search/ConditionType;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/cxf/jaxrs/ext/search/ConditionType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/cxf/jaxrs/ext/search/ConditionType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/jaxrs/ext/search/ConditionType;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/jaxrs/ext/search/ConditionType");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;I)V", "()V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/ext/search/ConditionType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EQUALS");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/ConditionType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/jaxrs/ext/search/ConditionType", "EQUALS", "Lorg/apache/cxf/jaxrs/ext/search/ConditionType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/ext/search/ConditionType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NOT_EQUALS");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/ConditionType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/jaxrs/ext/search/ConditionType", "NOT_EQUALS", "Lorg/apache/cxf/jaxrs/ext/search/ConditionType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/ext/search/ConditionType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("LESS_THAN");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/ConditionType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/jaxrs/ext/search/ConditionType", "LESS_THAN", "Lorg/apache/cxf/jaxrs/ext/search/ConditionType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/ext/search/ConditionType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("GREATER_THAN");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/ConditionType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/jaxrs/ext/search/ConditionType", "GREATER_THAN", "Lorg/apache/cxf/jaxrs/ext/search/ConditionType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/ext/search/ConditionType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("LESS_OR_EQUALS");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/ConditionType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/jaxrs/ext/search/ConditionType", "LESS_OR_EQUALS", "Lorg/apache/cxf/jaxrs/ext/search/ConditionType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/ext/search/ConditionType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("GREATER_OR_EQUALS");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/ConditionType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/jaxrs/ext/search/ConditionType", "GREATER_OR_EQUALS", "Lorg/apache/cxf/jaxrs/ext/search/ConditionType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/ext/search/ConditionType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OR");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/ConditionType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/jaxrs/ext/search/ConditionType", "OR", "Lorg/apache/cxf/jaxrs/ext/search/ConditionType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/ext/search/ConditionType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AND");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/ConditionType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/jaxrs/ext/search/ConditionType", "AND", "Lorg/apache/cxf/jaxrs/ext/search/ConditionType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/ext/search/ConditionType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CUSTOM");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/ConditionType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/jaxrs/ext/search/ConditionType", "CUSTOM", "Lorg/apache/cxf/jaxrs/ext/search/ConditionType;");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/cxf/jaxrs/ext/search/ConditionType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/jaxrs/ext/search/ConditionType", "EQUALS", "Lorg/apache/cxf/jaxrs/ext/search/ConditionType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/jaxrs/ext/search/ConditionType", "NOT_EQUALS", "Lorg/apache/cxf/jaxrs/ext/search/ConditionType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/jaxrs/ext/search/ConditionType", "LESS_THAN", "Lorg/apache/cxf/jaxrs/ext/search/ConditionType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/jaxrs/ext/search/ConditionType", "GREATER_THAN", "Lorg/apache/cxf/jaxrs/ext/search/ConditionType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/jaxrs/ext/search/ConditionType", "LESS_OR_EQUALS", "Lorg/apache/cxf/jaxrs/ext/search/ConditionType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/jaxrs/ext/search/ConditionType", "GREATER_OR_EQUALS", "Lorg/apache/cxf/jaxrs/ext/search/ConditionType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/jaxrs/ext/search/ConditionType", "OR", "Lorg/apache/cxf/jaxrs/ext/search/ConditionType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/jaxrs/ext/search/ConditionType", "AND", "Lorg/apache/cxf/jaxrs/ext/search/ConditionType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/jaxrs/ext/search/ConditionType", "CUSTOM", "Lorg/apache/cxf/jaxrs/ext/search/ConditionType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/jaxrs/ext/search/ConditionType", "$VALUES", "[Lorg/apache/cxf/jaxrs/ext/search/ConditionType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
