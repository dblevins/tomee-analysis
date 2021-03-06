package asm.jakarta.faces.el;
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
public class PropertyResolverDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT | ACC_DEPRECATED, "jakarta/faces/el/PropertyResolver", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_DEPRECATED, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT | ACC_DEPRECATED, "getType", "(Ljava/lang/Object;I)Ljava/lang/Class;", null, new String[] { "jakarta/faces/el/EvaluationException", "jakarta/faces/el/PropertyNotFoundException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT | ACC_DEPRECATED, "getType", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Class;", null, new String[] { "jakarta/faces/el/EvaluationException", "jakarta/faces/el/PropertyNotFoundException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT | ACC_DEPRECATED, "getValue", "(Ljava/lang/Object;I)Ljava/lang/Object;", null, new String[] { "jakarta/faces/el/EvaluationException", "jakarta/faces/el/PropertyNotFoundException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT | ACC_DEPRECATED, "getValue", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", null, new String[] { "jakarta/faces/el/EvaluationException", "jakarta/faces/el/PropertyNotFoundException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT | ACC_DEPRECATED, "isReadOnly", "(Ljava/lang/Object;I)Z", null, new String[] { "jakarta/faces/el/EvaluationException", "jakarta/faces/el/PropertyNotFoundException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT | ACC_DEPRECATED, "isReadOnly", "(Ljava/lang/Object;Ljava/lang/Object;)Z", null, new String[] { "jakarta/faces/el/EvaluationException", "jakarta/faces/el/PropertyNotFoundException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT | ACC_DEPRECATED, "setValue", "(Ljava/lang/Object;ILjava/lang/Object;)V", null, new String[] { "jakarta/faces/el/EvaluationException", "jakarta/faces/el/PropertyNotFoundException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT | ACC_DEPRECATED, "setValue", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", null, new String[] { "jakarta/faces/el/EvaluationException", "jakarta/faces/el/PropertyNotFoundException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
