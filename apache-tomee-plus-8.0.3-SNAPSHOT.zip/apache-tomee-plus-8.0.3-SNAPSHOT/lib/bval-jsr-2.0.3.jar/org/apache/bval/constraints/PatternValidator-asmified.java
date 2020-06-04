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
public class PatternValidatorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/bval/constraints/PatternValidator", "Lorg/apache/bval/constraints/AbstractPatternValidator<Ljavax/validation/constraints/Pattern;Ljava/lang/CharSequence;>;", "org/apache/bval/constraints/AbstractPatternValidator", null);

classWriter.visitInnerClass("org/apache/bval/constraints/PatternValidator$1", null, null, 0);

classWriter.visitInnerClass("org/apache/bval/constraints/AbstractPatternValidator$PatternDescriptor", "org/apache/bval/constraints/AbstractPatternValidator", "PatternDescriptor", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/bval/constraints/PatternValidator", "lambda$new$0", "(Ljavax/validation/constraints/Pattern;)Lorg/apache/bval/constraints/AbstractPatternValidator$PatternDescriptor;", false), Type.getType("(Ljavax/validation/constraints/Pattern;)Lorg/apache/bval/constraints/AbstractPatternValidator$PatternDescriptor;")});
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/constraints/AbstractPatternValidator", "<init>", "(Ljava/util/function/Function;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$new$0", "(Ljavax/validation/constraints/Pattern;)Lorg/apache/bval/constraints/AbstractPatternValidator$PatternDescriptor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/constraints/PatternValidator$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/constraints/PatternValidator$1", "<init>", "(Ljavax/validation/constraints/Pattern;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
