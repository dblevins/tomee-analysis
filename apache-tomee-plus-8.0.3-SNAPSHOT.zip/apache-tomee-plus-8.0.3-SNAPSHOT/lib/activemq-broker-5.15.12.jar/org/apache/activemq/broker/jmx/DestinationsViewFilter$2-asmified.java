package asm.org.apache.activemq.broker.jmx;
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
public class DestinationsViewFilter$2Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/broker/jmx/DestinationsViewFilter$2", "Lcom/google/common/collect/Ordering<Ljava/util/Map$Entry<Ljavax/management/ObjectName;Lorg/apache/activemq/broker/jmx/DestinationView;>;>;", "com/google/common/collect/Ordering", null);

classWriter.visitOuterClass("org/apache/activemq/broker/jmx/DestinationsViewFilter", "getOrdering", "()Lcom/google/common/collect/Ordering;");

classWriter.visitInnerClass("org/apache/activemq/broker/jmx/DestinationsViewFilter$2", null, null, 0);

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(0, "getter", "Ljava/lang/reflect/Method;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/broker/jmx/DestinationsViewFilter;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/broker/jmx/DestinationsViewFilter;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/jmx/DestinationsViewFilter$2", "this$0", "Lorg/apache/activemq/broker/jmx/DestinationsViewFilter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/google/common/collect/Ordering", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/activemq/broker/jmx/DestinationView;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/DestinationsViewFilter$2", "this$0", "Lorg/apache/activemq/broker/jmx/DestinationsViewFilter;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/jmx/DestinationsViewFilter", "getSortColumn", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/util/IntrospectionSupport", "findGetterMethod", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/jmx/DestinationsViewFilter$2", "getter", "Ljava/lang/reflect/Method;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "compare", "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;)I", "(Ljava/util/Map$Entry<Ljavax/management/ObjectName;Lorg/apache/activemq/broker/jmx/DestinationView;>;Ljava/util/Map$Entry<Ljavax/management/ObjectName;Lorg/apache/activemq/broker/jmx/DestinationView;>;)I", null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label2, "java/lang/Exception");
Label label5 = new Label();
Label label6 = new Label();
methodVisitor.visitTryCatchBlock(label5, label6, label2, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/DestinationsViewFilter$2", "getter", "Ljava/lang/reflect/Method;");
methodVisitor.visitJumpInsn(IFNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/DestinationsViewFilter$2", "getter", "Ljava/lang/reflect/Method;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "invoke", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/DestinationsViewFilter$2", "getter", "Ljava/lang/reflect/Method;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "invoke", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/lang/Comparable");
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/lang/Comparable");
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/DestinationsViewFilter$2", "this$0", "Lorg/apache/activemq/broker/jmx/DestinationsViewFilter;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/jmx/DestinationsViewFilter", "getSortOrder", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toLowerCase", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn("desc");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Comparable");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/Comparable", "compareTo", "(Ljava/lang/Object;)I", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/Object", "java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Comparable");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/Comparable", "compareTo", "(Ljava/lang/Object;)I", true);
methodVisitor.visitLabel(label4);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label6);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/broker/jmx/DestinationsViewFilter", "access$000", "()Lorg/slf4j/Logger;", false);
methodVisitor.visitLdcInsn("Exception sorting destinations");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "info", "(Ljava/lang/String;Ljava/lang/Throwable;)V", true);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map$Entry");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map$Entry");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/jmx/DestinationsViewFilter$2", "compare", "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
