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
public class PastOrPresentValidator$ForChronoZonedDateTimeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/bval/constraints/PastOrPresentValidator$ForChronoZonedDateTime", "Lorg/apache/bval/constraints/PastOrPresentValidator<Ljava/time/chrono/ChronoZonedDateTime<*>;>;", "org/apache/bval/constraints/PastOrPresentValidator", null);

classWriter.visitInnerClass("org/apache/bval/constraints/PastOrPresentValidator$ForChronoZonedDateTime", "org/apache/bval/constraints/PastOrPresentValidator", "ForChronoZonedDateTime", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "java/time/ZonedDateTime", "now", "(Ljava/time/Clock;)Ljava/time/ZonedDateTime;", false), Type.getType("(Ljava/time/Clock;)Ljava/time/chrono/ChronoZonedDateTime;")});
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/constraints/PastOrPresentValidator$ForChronoZonedDateTime", "CHRONO_ZONED_DATE_TIME_COMPARATOR", "Ljava/util/Comparator;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/constraints/PastOrPresentValidator", "<init>", "(Ljava/util/function/Function;Ljava/util/Comparator;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
