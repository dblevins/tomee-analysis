package asm.org.apache.openejb.core.webservices;
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
public class ProviderWrapper$ProviderWrapperDataDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openejb/core/webservices/ProviderWrapper$ProviderWrapperData", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/openejb/core/ivm/naming/JaxWsServiceReference$WebServiceClientCustomizer", "org/apache/openejb/core/ivm/naming/JaxWsServiceReference", "WebServiceClientCustomizer", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/openejb/core/webservices/ProviderWrapper$ProviderWrapperData", "org/apache/openejb/core/webservices/ProviderWrapper", "ProviderWrapperData", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "portRefData", "Ljava/util/List;", "Ljava/util/List<Lorg/apache/openejb/core/webservices/PortRefData;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "callerClassLoader", "Ljava/lang/ClassLoader;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "customizer", "Lorg/apache/openejb/core/ivm/naming/JaxWsServiceReference$WebServiceClientCustomizer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "properties", "Ljava/util/Properties;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/util/List;Ljava/lang/ClassLoader;Lorg/apache/openejb/core/ivm/naming/JaxWsServiceReference$WebServiceClientCustomizer;Ljava/util/Properties;)V", "(Ljava/util/List<Lorg/apache/openejb/core/webservices/PortRefData;>;Ljava/lang/ClassLoader;Lorg/apache/openejb/core/ivm/naming/JaxWsServiceReference$WebServiceClientCustomizer;Ljava/util/Properties;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/webservices/ProviderWrapper$ProviderWrapperData", "portRefData", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/webservices/ProviderWrapper$ProviderWrapperData", "callerClassLoader", "Ljava/lang/ClassLoader;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/webservices/ProviderWrapper$ProviderWrapperData", "customizer", "Lorg/apache/openejb/core/ivm/naming/JaxWsServiceReference$WebServiceClientCustomizer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/webservices/ProviderWrapper$ProviderWrapperData", "properties", "Ljava/util/Properties;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lorg/apache/openejb/core/webservices/ProviderWrapper$ProviderWrapperData;)Ljava/lang/ClassLoader;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/webservices/ProviderWrapper$ProviderWrapperData", "callerClassLoader", "Ljava/lang/ClassLoader;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lorg/apache/openejb/core/webservices/ProviderWrapper$ProviderWrapperData;)Ljava/util/List;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/webservices/ProviderWrapper$ProviderWrapperData", "portRefData", "Ljava/util/List;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$300", "(Lorg/apache/openejb/core/webservices/ProviderWrapper$ProviderWrapperData;)Lorg/apache/openejb/core/ivm/naming/JaxWsServiceReference$WebServiceClientCustomizer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/webservices/ProviderWrapper$ProviderWrapperData", "customizer", "Lorg/apache/openejb/core/ivm/naming/JaxWsServiceReference$WebServiceClientCustomizer;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$400", "(Lorg/apache/openejb/core/webservices/ProviderWrapper$ProviderWrapperData;)Ljava/util/Properties;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/webservices/ProviderWrapper$ProviderWrapperData", "properties", "Ljava/util/Properties;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
