package asm.org.apache.cxf.transport;
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
public class TransportFinder$2Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/transport/TransportFinder$2", "Ljava/lang/Object;Lorg/apache/cxf/configuration/ConfiguredBeanLocator$BeanLoaderListener<TT;>;", "java/lang/Object", new String[] { "org/apache/cxf/configuration/ConfiguredBeanLocator$BeanLoaderListener" });

classWriter.visitOuterClass("org/apache/cxf/transport/TransportFinder", "loadActivationNamespaces", "(Ljava/lang/String;)Ljava/lang/Object;");

classWriter.visitInnerClass("org/apache/cxf/transport/TransportFinder$2", null, null, 0);

classWriter.visitInnerClass("org/apache/cxf/configuration/ConfiguredBeanLocator$BeanLoaderListener", "org/apache/cxf/configuration/ConfiguredBeanLocator", "BeanLoaderListener", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$namespace", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/cxf/transport/TransportFinder;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/transport/TransportFinder;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/transport/TransportFinder$2", "this$0", "Lorg/apache/cxf/transport/TransportFinder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/transport/TransportFinder$2", "val$namespace", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "beanLoaded", "(Ljava/lang/String;Ljava/lang/Object;)Z", "(Ljava/lang/String;TT;)Z", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/TransportFinder$2", "this$0", "Lorg/apache/cxf/transport/TransportFinder;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/TransportFinder", "loaded", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/TransportFinder$2", "this$0", "Lorg/apache/cxf/transport/TransportFinder;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/TransportFinder", "map", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/TransportFinder$2", "val$namespace", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "containsKey", "(Ljava/lang/Object;)Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/TransportFinder$2", "this$0", "Lorg/apache/cxf/transport/TransportFinder;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/transport/TransportFinder", "access$000", "(Lorg/apache/cxf/transport/TransportFinder;Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/TransportFinder$2", "this$0", "Lorg/apache/cxf/transport/TransportFinder;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/TransportFinder", "map", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/TransportFinder$2", "val$namespace", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "containsKey", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "loadBean", "(Ljava/lang/String;Ljava/lang/Class;)Z", "(Ljava/lang/String;Ljava/lang/Class<+TT;>;)Z", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/TransportFinder$2", "this$0", "Lorg/apache/cxf/transport/TransportFinder;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/TransportFinder", "locator", "Lorg/apache/cxf/configuration/ConfiguredBeanLocator;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("transportIds");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/TransportFinder$2", "val$namespace", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/configuration/ConfiguredBeanLocator", "hasConfiguredPropertyValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
