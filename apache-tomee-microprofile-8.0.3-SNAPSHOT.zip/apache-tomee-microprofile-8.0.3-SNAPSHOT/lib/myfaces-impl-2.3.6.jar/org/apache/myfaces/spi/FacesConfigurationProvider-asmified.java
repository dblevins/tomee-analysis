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
public class FacesConfigurationProviderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/myfaces/spi/FacesConfigurationProvider", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getStandardFacesConfig", "(Ljakarta/faces/context/ExternalContext;)Lorg/apache/myfaces/config/element/FacesConfig;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMetaInfServicesFacesConfig", "(Ljakarta/faces/context/ExternalContext;)Lorg/apache/myfaces/config/element/FacesConfig;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAnnotationsFacesConfig", "(Ljakarta/faces/context/ExternalContext;Z)Lorg/apache/myfaces/config/element/FacesConfig;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getClassloaderFacesConfig", "(Ljakarta/faces/context/ExternalContext;)Ljava/util/List;", "(Ljakarta/faces/context/ExternalContext;)Ljava/util/List<Lorg/apache/myfaces/config/element/FacesConfig;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getContextSpecifiedFacesConfig", "(Ljakarta/faces/context/ExternalContext;)Ljava/util/List;", "(Ljakarta/faces/context/ExternalContext;)Ljava/util/List<Lorg/apache/myfaces/config/element/FacesConfig;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getWebAppFacesConfig", "(Ljakarta/faces/context/ExternalContext;)Lorg/apache/myfaces/config/element/FacesConfig;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getFacesFlowFacesConfig", "(Ljakarta/faces/context/ExternalContext;)Ljava/util/List;", "(Ljakarta/faces/context/ExternalContext;)Ljava/util/List<Lorg/apache/myfaces/config/element/FacesConfig;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getApplicationConfigurationResourceDocumentPopulatorFacesConfig", "(Ljakarta/faces/context/ExternalContext;)Ljava/util/List;", "(Ljakarta/faces/context/ExternalContext;)Ljava/util/List<Lorg/apache/myfaces/config/element/FacesConfig;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getFaceletTaglibFacesConfig", "(Ljakarta/faces/context/ExternalContext;)Ljava/util/List;", "(Ljakarta/faces/context/ExternalContext;)Ljava/util/List<Lorg/apache/myfaces/config/element/FacesConfig;>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
