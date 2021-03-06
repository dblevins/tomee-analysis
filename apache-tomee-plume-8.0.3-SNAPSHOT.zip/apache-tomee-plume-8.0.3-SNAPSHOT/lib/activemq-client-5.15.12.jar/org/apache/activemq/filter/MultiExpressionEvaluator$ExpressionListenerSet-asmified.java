package asm.org.apache.activemq.filter;
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
public class MultiExpressionEvaluator$ExpressionListenerSetDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/filter/MultiExpressionEvaluator$ExpressionListenerSet", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/activemq/filter/MultiExpressionEvaluator$ExpressionListener", "org/apache/activemq/filter/MultiExpressionEvaluator", "ExpressionListener", ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/activemq/filter/MultiExpressionEvaluator$ExpressionListenerSet", "org/apache/activemq/filter/MultiExpressionEvaluator", "ExpressionListenerSet", ACC_STATIC);

{
fieldVisitor = classWriter.visitField(0, "expression", "Lorg/apache/activemq/filter/Expression;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "listeners", "Ljava/util/List;", "Ljava/util/List<Lorg/apache/activemq/filter/MultiExpressionEvaluator$ExpressionListener;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/filter/MultiExpressionEvaluator$ExpressionListenerSet", "listeners", "Ljava/util/List;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
