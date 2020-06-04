package asm.org.eclipse.persistence.jpa.jpql.parser;
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
public class TrimExpression$SpecificationDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/eclipse/persistence/jpa/jpql/parser/TrimExpression$Specification", "Ljava/lang/Enum<Lorg/eclipse/persistence/jpa/jpql/parser/TrimExpression$Specification;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/eclipse/persistence/jpa/jpql/parser/TrimExpression$Specification", "org/eclipse/persistence/jpa/jpql/parser/TrimExpression", "Specification", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BOTH", "Lorg/eclipse/persistence/jpa/jpql/parser/TrimExpression$Specification;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DEFAULT", "Lorg/eclipse/persistence/jpa/jpql/parser/TrimExpression$Specification;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "LEADING", "Lorg/eclipse/persistence/jpa/jpql/parser/TrimExpression$Specification;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TRAILING", "Lorg/eclipse/persistence/jpa/jpql/parser/TrimExpression$Specification;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "value", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "ENUM$VALUES", "[Lorg/eclipse/persistence/jpa/jpql/parser/TrimExpression$Specification;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/TrimExpression$Specification");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BOTH");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("BOTH");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/TrimExpression$Specification", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jpa/jpql/parser/TrimExpression$Specification", "BOTH", "Lorg/eclipse/persistence/jpa/jpql/parser/TrimExpression$Specification;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/TrimExpression$Specification");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DEFAULT");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/TrimExpression$Specification", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jpa/jpql/parser/TrimExpression$Specification", "DEFAULT", "Lorg/eclipse/persistence/jpa/jpql/parser/TrimExpression$Specification;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/TrimExpression$Specification");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("LEADING");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("LEADING");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/TrimExpression$Specification", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jpa/jpql/parser/TrimExpression$Specification", "LEADING", "Lorg/eclipse/persistence/jpa/jpql/parser/TrimExpression$Specification;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/parser/TrimExpression$Specification");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TRAILING");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("TRAILING");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/parser/TrimExpression$Specification", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jpa/jpql/parser/TrimExpression$Specification", "TRAILING", "Lorg/eclipse/persistence/jpa/jpql/parser/TrimExpression$Specification;");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/persistence/jpa/jpql/parser/TrimExpression$Specification");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/parser/TrimExpression$Specification", "BOTH", "Lorg/eclipse/persistence/jpa/jpql/parser/TrimExpression$Specification;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/parser/TrimExpression$Specification", "DEFAULT", "Lorg/eclipse/persistence/jpa/jpql/parser/TrimExpression$Specification;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/parser/TrimExpression$Specification", "LEADING", "Lorg/eclipse/persistence/jpa/jpql/parser/TrimExpression$Specification;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/parser/TrimExpression$Specification", "TRAILING", "Lorg/eclipse/persistence/jpa/jpql/parser/TrimExpression$Specification;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jpa/jpql/parser/TrimExpression$Specification", "ENUM$VALUES", "[Lorg/eclipse/persistence/jpa/jpql/parser/TrimExpression$Specification;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jpa/jpql/parser/TrimExpression$Specification", "value", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getValue", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jpa/jpql/parser/TrimExpression$Specification", "value", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/eclipse/persistence/jpa/jpql/parser/TrimExpression$Specification;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/parser/TrimExpression$Specification", "ENUM$VALUES", "[Lorg/eclipse/persistence/jpa/jpql/parser/TrimExpression$Specification;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/persistence/jpa/jpql/parser/TrimExpression$Specification");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/eclipse/persistence/jpa/jpql/parser/TrimExpression$Specification;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/jpa/jpql/parser/TrimExpression$Specification;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/jpa/jpql/parser/TrimExpression$Specification");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
