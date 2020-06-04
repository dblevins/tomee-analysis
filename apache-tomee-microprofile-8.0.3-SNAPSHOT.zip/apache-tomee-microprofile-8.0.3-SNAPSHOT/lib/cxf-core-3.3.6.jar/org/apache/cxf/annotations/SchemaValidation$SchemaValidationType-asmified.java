package asm.org.apache.cxf.annotations;
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
public class SchemaValidation$SchemaValidationTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/cxf/annotations/SchemaValidation$SchemaValidationType", "Ljava/lang/Enum<Lorg/apache/cxf/annotations/SchemaValidation$SchemaValidationType;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/cxf/annotations/SchemaValidation$SchemaValidationType", "org/apache/cxf/annotations/SchemaValidation", "SchemaValidationType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "IN", "Lorg/apache/cxf/annotations/SchemaValidation$SchemaValidationType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "REQUEST", "Lorg/apache/cxf/annotations/SchemaValidation$SchemaValidationType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OUT", "Lorg/apache/cxf/annotations/SchemaValidation$SchemaValidationType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "RESPONSE", "Lorg/apache/cxf/annotations/SchemaValidation$SchemaValidationType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BOTH", "Lorg/apache/cxf/annotations/SchemaValidation$SchemaValidationType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NONE", "Lorg/apache/cxf/annotations/SchemaValidation$SchemaValidationType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/cxf/annotations/SchemaValidation$SchemaValidationType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/cxf/annotations/SchemaValidation$SchemaValidationType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/annotations/SchemaValidation$SchemaValidationType", "$VALUES", "[Lorg/apache/cxf/annotations/SchemaValidation$SchemaValidationType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/cxf/annotations/SchemaValidation$SchemaValidationType;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/cxf/annotations/SchemaValidation$SchemaValidationType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/cxf/annotations/SchemaValidation$SchemaValidationType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/annotations/SchemaValidation$SchemaValidationType;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/annotations/SchemaValidation$SchemaValidationType");
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
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/annotations/SchemaValidation$SchemaValidationType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IN");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/annotations/SchemaValidation$SchemaValidationType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/annotations/SchemaValidation$SchemaValidationType", "IN", "Lorg/apache/cxf/annotations/SchemaValidation$SchemaValidationType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/annotations/SchemaValidation$SchemaValidationType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("REQUEST");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/annotations/SchemaValidation$SchemaValidationType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/annotations/SchemaValidation$SchemaValidationType", "REQUEST", "Lorg/apache/cxf/annotations/SchemaValidation$SchemaValidationType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/annotations/SchemaValidation$SchemaValidationType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OUT");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/annotations/SchemaValidation$SchemaValidationType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/annotations/SchemaValidation$SchemaValidationType", "OUT", "Lorg/apache/cxf/annotations/SchemaValidation$SchemaValidationType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/annotations/SchemaValidation$SchemaValidationType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RESPONSE");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/annotations/SchemaValidation$SchemaValidationType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/annotations/SchemaValidation$SchemaValidationType", "RESPONSE", "Lorg/apache/cxf/annotations/SchemaValidation$SchemaValidationType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/annotations/SchemaValidation$SchemaValidationType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BOTH");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/annotations/SchemaValidation$SchemaValidationType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/annotations/SchemaValidation$SchemaValidationType", "BOTH", "Lorg/apache/cxf/annotations/SchemaValidation$SchemaValidationType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/annotations/SchemaValidation$SchemaValidationType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NONE");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/annotations/SchemaValidation$SchemaValidationType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/annotations/SchemaValidation$SchemaValidationType", "NONE", "Lorg/apache/cxf/annotations/SchemaValidation$SchemaValidationType;");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/cxf/annotations/SchemaValidation$SchemaValidationType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/annotations/SchemaValidation$SchemaValidationType", "IN", "Lorg/apache/cxf/annotations/SchemaValidation$SchemaValidationType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/annotations/SchemaValidation$SchemaValidationType", "REQUEST", "Lorg/apache/cxf/annotations/SchemaValidation$SchemaValidationType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/annotations/SchemaValidation$SchemaValidationType", "OUT", "Lorg/apache/cxf/annotations/SchemaValidation$SchemaValidationType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/annotations/SchemaValidation$SchemaValidationType", "RESPONSE", "Lorg/apache/cxf/annotations/SchemaValidation$SchemaValidationType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/annotations/SchemaValidation$SchemaValidationType", "BOTH", "Lorg/apache/cxf/annotations/SchemaValidation$SchemaValidationType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/annotations/SchemaValidation$SchemaValidationType", "NONE", "Lorg/apache/cxf/annotations/SchemaValidation$SchemaValidationType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/annotations/SchemaValidation$SchemaValidationType", "$VALUES", "[Lorg/apache/cxf/annotations/SchemaValidation$SchemaValidationType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
