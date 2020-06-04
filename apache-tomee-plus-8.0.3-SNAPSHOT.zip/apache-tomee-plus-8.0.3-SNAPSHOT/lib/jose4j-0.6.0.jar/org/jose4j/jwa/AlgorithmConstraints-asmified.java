package asm.org.jose4j.jwa;
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
public class AlgorithmConstraintsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/jose4j/jwa/AlgorithmConstraints", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/jose4j/jwa/AlgorithmConstraints$1", "org/jose4j/jwa/AlgorithmConstraints", null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/jose4j/jwa/AlgorithmConstraints$ConstraintType", "org/jose4j/jwa/AlgorithmConstraints", "ConstraintType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NO_CONSTRAINTS", "Lorg/jose4j/jwa/AlgorithmConstraints;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DISALLOW_NONE", "Lorg/jose4j/jwa/AlgorithmConstraints;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALLOW_ONLY_NONE", "Lorg/jose4j/jwa/AlgorithmConstraints;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "type", "Lorg/jose4j/jwa/AlgorithmConstraints$ConstraintType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "algorithms", "Ljava/util/Set;", "Ljava/util/Set<Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "<init>", "(Lorg/jose4j/jwa/AlgorithmConstraints$ConstraintType;[Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/NullPointerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ConstraintType cannot be null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/NullPointerException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/jose4j/jwa/AlgorithmConstraints", "org/jose4j/jwa/AlgorithmConstraints$ConstraintType", "[Ljava/lang/String;"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwa/AlgorithmConstraints", "type", "Lorg/jose4j/jwa/AlgorithmConstraints$ConstraintType;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashSet", "<init>", "(Ljava/util/Collection;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwa/AlgorithmConstraints", "algorithms", "Ljava/util/Set;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "checkConstraint", "(Ljava/lang/String;)V", null, new String[] { "org/jose4j/lang/InvalidAlgorithmException" });
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/jose4j/jwa/AlgorithmConstraints$1", "$SwitchMap$org$jose4j$jwa$AlgorithmConstraints$ConstraintType", "[I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwa/AlgorithmConstraints", "type", "Lorg/jose4j/jwa/AlgorithmConstraints$ConstraintType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwa/AlgorithmConstraints$ConstraintType", "ordinal", "()I", false);
methodVisitor.visitInsn(IALOAD);
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitLookupSwitchInsn(label2, new int[] { 1, 2 }, new Label[] { label0, label1 });
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwa/AlgorithmConstraints", "algorithms", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "contains", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/lang/InvalidAlgorithmException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("'");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("' is not a whitelisted algorithm.");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/lang/InvalidAlgorithmException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwa/AlgorithmConstraints", "algorithms", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "contains", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/lang/InvalidAlgorithmException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("'");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("' is a blacklisted algorithm.");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/lang/InvalidAlgorithmException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwa/AlgorithmConstraints");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/jose4j/jwa/AlgorithmConstraints$ConstraintType", "BLACKLIST", "Lorg/jose4j/jwa/AlgorithmConstraints$ConstraintType;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwa/AlgorithmConstraints", "<init>", "(Lorg/jose4j/jwa/AlgorithmConstraints$ConstraintType;[Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/jose4j/jwa/AlgorithmConstraints", "NO_CONSTRAINTS", "Lorg/jose4j/jwa/AlgorithmConstraints;");
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwa/AlgorithmConstraints");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/jose4j/jwa/AlgorithmConstraints$ConstraintType", "BLACKLIST", "Lorg/jose4j/jwa/AlgorithmConstraints$ConstraintType;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("none");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwa/AlgorithmConstraints", "<init>", "(Lorg/jose4j/jwa/AlgorithmConstraints$ConstraintType;[Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/jose4j/jwa/AlgorithmConstraints", "DISALLOW_NONE", "Lorg/jose4j/jwa/AlgorithmConstraints;");
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwa/AlgorithmConstraints");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/jose4j/jwa/AlgorithmConstraints$ConstraintType", "WHITELIST", "Lorg/jose4j/jwa/AlgorithmConstraints$ConstraintType;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("none");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwa/AlgorithmConstraints", "<init>", "(Lorg/jose4j/jwa/AlgorithmConstraints$ConstraintType;[Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/jose4j/jwa/AlgorithmConstraints", "ALLOW_ONLY_NONE", "Lorg/jose4j/jwa/AlgorithmConstraints;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
