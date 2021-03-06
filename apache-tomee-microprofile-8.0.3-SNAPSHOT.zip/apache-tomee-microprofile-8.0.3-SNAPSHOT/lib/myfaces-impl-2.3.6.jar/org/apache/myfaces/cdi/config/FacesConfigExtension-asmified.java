package asm.org.apache.myfaces.cdi.config;
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
public class FacesConfigExtensionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/myfaces/cdi/config/FacesConfigExtension", null, "java/lang/Object", new String[] { "jakarta/enterprise/inject/spi/Extension" });

classWriter.visitInnerClass("jakarta/faces/annotation/FacesConfig$Version", "jakarta/faces/annotation/FacesConfig", "Version", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "facesConfigVersion", "Ljakarta/faces/annotation/FacesConfig$Version;", null, null);
fieldVisitor.visitEnd();
}
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
methodVisitor = classWriter.visitMethod(0, "beforeBeanDiscovery", "(Ljakarta/enterprise/inject/spi/BeforeBeanDiscovery;Ljakarta/enterprise/inject/spi/BeanManager;)V", null, null);
methodVisitor.visitAnnotableParameterCount(2, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljakarta/enterprise/event/Observes;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/myfaces/cdi/config/FacesConfigBeanHolder;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/enterprise/inject/spi/BeanManager", "createAnnotatedType", "(Ljava/lang/Class;)Ljakarta/enterprise/inject/spi/AnnotatedType;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/enterprise/inject/spi/AnnotatedType", "getJavaClass", "()Ljava/lang/Class;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/enterprise/inject/spi/BeforeBeanDiscovery", "addAnnotatedType", "(Ljakarta/enterprise/inject/spi/AnnotatedType;Ljava/lang/String;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "collect", "(Ljakarta/enterprise/inject/spi/ProcessManagedBean;)V", "<T:Ljava/lang/Object;>(Ljakarta/enterprise/inject/spi/ProcessManagedBean<TT;>;)V", null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljakarta/enterprise/event/Observes;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/enterprise/inject/spi/ProcessManagedBean", "getAnnotatedBeanClass", "()Ljakarta/enterprise/inject/spi/AnnotatedType;", true);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/faces/annotation/FacesConfig;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/enterprise/inject/spi/AnnotatedType", "isAnnotationPresent", "(Ljava/lang/Class;)Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/enterprise/inject/spi/ProcessManagedBean", "getAnnotatedBeanClass", "()Ljakarta/enterprise/inject/spi/AnnotatedType;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/faces/annotation/FacesConfig;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/enterprise/inject/spi/Annotated", "getAnnotation", "(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/faces/annotation/FacesConfig");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/cdi/config/FacesConfigExtension", "facesConfigVersion", "Ljakarta/faces/annotation/FacesConfig$Version;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/cdi/config/FacesConfigExtension", "facesConfigVersion", "Ljakarta/faces/annotation/FacesConfig$Version;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/annotation/FacesConfig$Version", "ordinal", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/annotation/FacesConfig", "version", "()Ljakarta/faces/annotation/FacesConfig$Version;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/annotation/FacesConfig$Version", "ordinal", "()I", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/annotation/FacesConfig", "version", "()Ljakarta/faces/annotation/FacesConfig$Version;", true);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/myfaces/cdi/config/FacesConfigExtension", "jakarta/enterprise/inject/spi/ProcessManagedBean", "jakarta/enterprise/inject/spi/Annotated", "jakarta/faces/annotation/FacesConfig"}, 1, new Object[] {"org/apache/myfaces/cdi/config/FacesConfigExtension"});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/cdi/config/FacesConfigExtension", "facesConfigVersion", "Ljakarta/faces/annotation/FacesConfig$Version;");
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/myfaces/cdi/config/FacesConfigExtension", "jakarta/enterprise/inject/spi/ProcessManagedBean", "jakarta/enterprise/inject/spi/Annotated", "jakarta/faces/annotation/FacesConfig"}, 2, new Object[] {"org/apache/myfaces/cdi/config/FacesConfigExtension", "jakarta/faces/annotation/FacesConfig$Version"});
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/cdi/config/FacesConfigExtension", "facesConfigVersion", "Ljakarta/faces/annotation/FacesConfig$Version;");
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/annotation/FacesConfig", "version", "()Ljakarta/faces/annotation/FacesConfig$Version;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/cdi/config/FacesConfigExtension", "facesConfigVersion", "Ljakarta/faces/annotation/FacesConfig$Version;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "afterDeploymentValidation", "(Ljakarta/enterprise/inject/spi/AfterDeploymentValidation;Ljakarta/enterprise/inject/spi/BeanManager;)V", null, null);
methodVisitor.visitAnnotableParameterCount(2, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljakarta/enterprise/event/Observes;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/myfaces/cdi/config/FacesConfigBeanHolder;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/cdi/util/CDIUtils", "lookup", "(Ljakarta/enterprise/inject/spi/BeanManager;Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/myfaces/cdi/config/FacesConfigBeanHolder");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/cdi/config/FacesConfigExtension", "facesConfigVersion", "Ljakarta/faces/annotation/FacesConfig$Version;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/cdi/config/FacesConfigBeanHolder", "setFacesConfigVersion", "(Ljakarta/faces/annotation/FacesConfig$Version;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
