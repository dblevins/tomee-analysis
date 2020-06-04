package asm.org.apache.openejb.assembler.classic;
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
public class InterceptorBindingBuilder$TypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/openejb/assembler/classic/InterceptorBindingBuilder$Type", "Ljava/lang/Enum<Lorg/apache/openejb/assembler/classic/InterceptorBindingBuilder$Type;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/openejb/assembler/classic/InterceptorBindingBuilder$Type", "org/apache/openejb/assembler/classic/InterceptorBindingBuilder", "Type", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ADDITION_OR_LOWER_EXCLUSION", "Lorg/apache/openejb/assembler/classic/InterceptorBindingBuilder$Type;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SAME_LEVEL_EXCLUSION", "Lorg/apache/openejb/assembler/classic/InterceptorBindingBuilder$Type;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SAME_AND_LOWER_EXCLUSION", "Lorg/apache/openejb/assembler/classic/InterceptorBindingBuilder$Type;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EXPLICIT_ORDERING", "Lorg/apache/openejb/assembler/classic/InterceptorBindingBuilder$Type;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/openejb/assembler/classic/InterceptorBindingBuilder$Type;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/openejb/assembler/classic/InterceptorBindingBuilder$Type;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/assembler/classic/InterceptorBindingBuilder$Type", "$VALUES", "[Lorg/apache/openejb/assembler/classic/InterceptorBindingBuilder$Type;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/openejb/assembler/classic/InterceptorBindingBuilder$Type;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/openejb/assembler/classic/InterceptorBindingBuilder$Type;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/openejb/assembler/classic/InterceptorBindingBuilder$Type;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/assembler/classic/InterceptorBindingBuilder$Type;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/assembler/classic/InterceptorBindingBuilder$Type");
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
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/assembler/classic/InterceptorBindingBuilder$Type");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ADDITION_OR_LOWER_EXCLUSION");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/assembler/classic/InterceptorBindingBuilder$Type", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/assembler/classic/InterceptorBindingBuilder$Type", "ADDITION_OR_LOWER_EXCLUSION", "Lorg/apache/openejb/assembler/classic/InterceptorBindingBuilder$Type;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/assembler/classic/InterceptorBindingBuilder$Type");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SAME_LEVEL_EXCLUSION");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/assembler/classic/InterceptorBindingBuilder$Type", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/assembler/classic/InterceptorBindingBuilder$Type", "SAME_LEVEL_EXCLUSION", "Lorg/apache/openejb/assembler/classic/InterceptorBindingBuilder$Type;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/assembler/classic/InterceptorBindingBuilder$Type");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SAME_AND_LOWER_EXCLUSION");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/assembler/classic/InterceptorBindingBuilder$Type", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/assembler/classic/InterceptorBindingBuilder$Type", "SAME_AND_LOWER_EXCLUSION", "Lorg/apache/openejb/assembler/classic/InterceptorBindingBuilder$Type;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/assembler/classic/InterceptorBindingBuilder$Type");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EXPLICIT_ORDERING");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/assembler/classic/InterceptorBindingBuilder$Type", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/assembler/classic/InterceptorBindingBuilder$Type", "EXPLICIT_ORDERING", "Lorg/apache/openejb/assembler/classic/InterceptorBindingBuilder$Type;");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/openejb/assembler/classic/InterceptorBindingBuilder$Type");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/assembler/classic/InterceptorBindingBuilder$Type", "ADDITION_OR_LOWER_EXCLUSION", "Lorg/apache/openejb/assembler/classic/InterceptorBindingBuilder$Type;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/assembler/classic/InterceptorBindingBuilder$Type", "SAME_LEVEL_EXCLUSION", "Lorg/apache/openejb/assembler/classic/InterceptorBindingBuilder$Type;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/assembler/classic/InterceptorBindingBuilder$Type", "SAME_AND_LOWER_EXCLUSION", "Lorg/apache/openejb/assembler/classic/InterceptorBindingBuilder$Type;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/assembler/classic/InterceptorBindingBuilder$Type", "EXPLICIT_ORDERING", "Lorg/apache/openejb/assembler/classic/InterceptorBindingBuilder$Type;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/assembler/classic/InterceptorBindingBuilder$Type", "$VALUES", "[Lorg/apache/openejb/assembler/classic/InterceptorBindingBuilder$Type;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
