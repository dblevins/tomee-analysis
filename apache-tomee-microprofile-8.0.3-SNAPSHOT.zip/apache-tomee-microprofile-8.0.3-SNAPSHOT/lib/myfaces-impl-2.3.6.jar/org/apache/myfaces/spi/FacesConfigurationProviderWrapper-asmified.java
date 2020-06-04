package asm.org.apache.myfaces.spi;
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
public class FacesConfigurationProviderWrapperDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/myfaces/spi/FacesConfigurationProviderWrapper", "Lorg/apache/myfaces/spi/FacesConfigurationProvider;Ljakarta/faces/FacesWrapper<Lorg/apache/myfaces/spi/FacesConfigurationProvider;>;", "org/apache/myfaces/spi/FacesConfigurationProvider", new String[] { "jakarta/faces/FacesWrapper" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/spi/FacesConfigurationProvider", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStandardFacesConfig", "(Ljakarta/faces/context/ExternalContext;)Lorg/apache/myfaces/config/element/FacesConfig;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/spi/FacesConfigurationProviderWrapper", "getWrapped", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/myfaces/spi/FacesConfigurationProvider");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/spi/FacesConfigurationProvider", "getStandardFacesConfig", "(Ljakarta/faces/context/ExternalContext;)Lorg/apache/myfaces/config/element/FacesConfig;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMetaInfServicesFacesConfig", "(Ljakarta/faces/context/ExternalContext;)Lorg/apache/myfaces/config/element/FacesConfig;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/spi/FacesConfigurationProviderWrapper", "getWrapped", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/myfaces/spi/FacesConfigurationProvider");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/spi/FacesConfigurationProvider", "getMetaInfServicesFacesConfig", "(Ljakarta/faces/context/ExternalContext;)Lorg/apache/myfaces/config/element/FacesConfig;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAnnotationsFacesConfig", "(Ljakarta/faces/context/ExternalContext;Z)Lorg/apache/myfaces/config/element/FacesConfig;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/spi/FacesConfigurationProviderWrapper", "getWrapped", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/myfaces/spi/FacesConfigurationProvider");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/spi/FacesConfigurationProvider", "getAnnotationsFacesConfig", "(Ljakarta/faces/context/ExternalContext;Z)Lorg/apache/myfaces/config/element/FacesConfig;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getClassloaderFacesConfig", "(Ljakarta/faces/context/ExternalContext;)Ljava/util/List;", "(Ljakarta/faces/context/ExternalContext;)Ljava/util/List<Lorg/apache/myfaces/config/element/FacesConfig;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/spi/FacesConfigurationProviderWrapper", "getWrapped", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/myfaces/spi/FacesConfigurationProvider");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/spi/FacesConfigurationProvider", "getClassloaderFacesConfig", "(Ljakarta/faces/context/ExternalContext;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getContextSpecifiedFacesConfig", "(Ljakarta/faces/context/ExternalContext;)Ljava/util/List;", "(Ljakarta/faces/context/ExternalContext;)Ljava/util/List<Lorg/apache/myfaces/config/element/FacesConfig;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/spi/FacesConfigurationProviderWrapper", "getWrapped", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/myfaces/spi/FacesConfigurationProvider");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/spi/FacesConfigurationProvider", "getContextSpecifiedFacesConfig", "(Ljakarta/faces/context/ExternalContext;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getWebAppFacesConfig", "(Ljakarta/faces/context/ExternalContext;)Lorg/apache/myfaces/config/element/FacesConfig;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/spi/FacesConfigurationProviderWrapper", "getWrapped", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/myfaces/spi/FacesConfigurationProvider");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/spi/FacesConfigurationProvider", "getWebAppFacesConfig", "(Ljakarta/faces/context/ExternalContext;)Lorg/apache/myfaces/config/element/FacesConfig;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFacesFlowFacesConfig", "(Ljakarta/faces/context/ExternalContext;)Ljava/util/List;", "(Ljakarta/faces/context/ExternalContext;)Ljava/util/List<Lorg/apache/myfaces/config/element/FacesConfig;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/spi/FacesConfigurationProviderWrapper", "getWrapped", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/myfaces/spi/FacesConfigurationProvider");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/spi/FacesConfigurationProvider", "getFacesFlowFacesConfig", "(Ljakarta/faces/context/ExternalContext;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getApplicationConfigurationResourceDocumentPopulatorFacesConfig", "(Ljakarta/faces/context/ExternalContext;)Ljava/util/List;", "(Ljakarta/faces/context/ExternalContext;)Ljava/util/List<Lorg/apache/myfaces/config/element/FacesConfig;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/spi/FacesConfigurationProviderWrapper", "getWrapped", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/myfaces/spi/FacesConfigurationProvider");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/spi/FacesConfigurationProvider", "getApplicationConfigurationResourceDocumentPopulatorFacesConfig", "(Ljakarta/faces/context/ExternalContext;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFaceletTaglibFacesConfig", "(Ljakarta/faces/context/ExternalContext;)Ljava/util/List;", "(Ljakarta/faces/context/ExternalContext;)Ljava/util/List<Lorg/apache/myfaces/config/element/FacesConfig;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/spi/FacesConfigurationProviderWrapper", "getWrapped", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/myfaces/spi/FacesConfigurationProvider");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/spi/FacesConfigurationProvider", "getFaceletTaglibFacesConfig", "(Ljakarta/faces/context/ExternalContext;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
