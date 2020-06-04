package asm.org.apache.openjpa.kernel;
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
public class ExpressionStoreQuery$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openjpa/kernel/ExpressionStoreQuery$1", null, "java/lang/Object", new String[] { "org/apache/openjpa/kernel/exps/Resolver" });

classWriter.visitOuterClass("org/apache/openjpa/kernel/ExpressionStoreQuery", "getResolver", "()Lorg/apache/openjpa/kernel/exps/Resolver;");

classWriter.visitInnerClass("org/apache/openjpa/kernel/ExpressionStoreQuery$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openjpa/kernel/ExpressionStoreQuery;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/openjpa/kernel/ExpressionStoreQuery;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/kernel/ExpressionStoreQuery$1", "this$0", "Lorg/apache/openjpa/kernel/ExpressionStoreQuery;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "classForName", "(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/Class;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/ExpressionStoreQuery$1", "this$0", "Lorg/apache/openjpa/kernel/ExpressionStoreQuery;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/ExpressionStoreQuery", "ctx", "Lorg/apache/openjpa/kernel/QueryContext;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/QueryContext", "classForName", "(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/Class;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFilterListener", "(Ljava/lang/String;)Lorg/apache/openjpa/kernel/exps/FilterListener;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/ExpressionStoreQuery$1", "this$0", "Lorg/apache/openjpa/kernel/ExpressionStoreQuery;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/ExpressionStoreQuery", "ctx", "Lorg/apache/openjpa/kernel/QueryContext;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/QueryContext", "getFilterListener", "(Ljava/lang/String;)Lorg/apache/openjpa/kernel/exps/FilterListener;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAggregateListener", "(Ljava/lang/String;)Lorg/apache/openjpa/kernel/exps/AggregateListener;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/ExpressionStoreQuery$1", "this$0", "Lorg/apache/openjpa/kernel/ExpressionStoreQuery;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/ExpressionStoreQuery", "ctx", "Lorg/apache/openjpa/kernel/QueryContext;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/QueryContext", "getAggregateListener", "(Ljava/lang/String;)Lorg/apache/openjpa/kernel/exps/AggregateListener;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConfiguration", "()Lorg/apache/openjpa/conf/OpenJPAConfiguration;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/ExpressionStoreQuery$1", "this$0", "Lorg/apache/openjpa/kernel/ExpressionStoreQuery;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/ExpressionStoreQuery", "ctx", "Lorg/apache/openjpa/kernel/QueryContext;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/QueryContext", "getStoreContext", "()Lorg/apache/openjpa/kernel/StoreContext;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreContext", "getConfiguration", "()Lorg/apache/openjpa/conf/OpenJPAConfiguration;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getQueryContext", "()Lorg/apache/openjpa/kernel/QueryContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/ExpressionStoreQuery$1", "this$0", "Lorg/apache/openjpa/kernel/ExpressionStoreQuery;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/ExpressionStoreQuery", "ctx", "Lorg/apache/openjpa/kernel/QueryContext;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
