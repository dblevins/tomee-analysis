package asm.org.apache.bval.constraints;
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
public class EmailValidator$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/bval/constraints/EmailValidator$1", null, "java/lang/Object", new String[] { "org/apache/bval/constraints/AbstractPatternValidator$PatternDescriptor" });

classWriter.visitOuterClass("org/apache/bval/constraints/EmailValidator", "lambda$new$0", "(Ljavax/validation/constraints/Email;)Lorg/apache/bval/constraints/AbstractPatternValidator$PatternDescriptor;");

classWriter.visitInnerClass("org/apache/bval/constraints/EmailValidator$1", null, null, 0);

classWriter.visitInnerClass("javax/validation/constraints/Pattern$Flag", "javax/validation/constraints/Pattern", "Flag", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/bval/constraints/AbstractPatternValidator$PatternDescriptor", "org/apache/bval/constraints/AbstractPatternValidator", "PatternDescriptor", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$email", "Ljavax/validation/constraints/Email;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Ljavax/validation/constraints/Email;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/constraints/EmailValidator$1", "val$email", "Ljavax/validation/constraints/Email;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "regexp", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/constraints/EmailValidator$1", "val$email", "Ljavax/validation/constraints/Email;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/constraints/Email", "regexp", "()Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "flags", "()[Ljavax/validation/constraints/Pattern$Flag;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/constraints/EmailValidator$1", "val$email", "Ljavax/validation/constraints/Email;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/constraints/Email", "flags", "()[Ljavax/validation/constraints/Pattern$Flag;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
