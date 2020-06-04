package asm.org.apache.cxf.jaxrs.provider;
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
public class ServerProviderFactory$ServerFeatureContextConfigurableDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/jaxrs/provider/ServerProviderFactory$ServerFeatureContextConfigurable", "Lorg/apache/cxf/jaxrs/impl/ConfigurableImpl<Ljavax/ws/rs/core/FeatureContext;>;", "org/apache/cxf/jaxrs/impl/ConfigurableImpl", null);

classWriter.visitInnerClass("org/apache/cxf/jaxrs/provider/ServerProviderFactory$ServerFeatureContextConfigurable", "org/apache/cxf/jaxrs/provider/ServerProviderFactory", "ServerFeatureContextConfigurable", ACC_PRIVATE | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Ljavax/ws/rs/core/FeatureContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/ws/rs/RuntimeType", "SERVER", "Ljavax/ws/rs/RuntimeType;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/impl/ConfigurableImpl", "<init>", "(Ljavax/ws/rs/core/Configurable;Ljavax/ws/rs/RuntimeType;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
