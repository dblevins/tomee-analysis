package asm.com.sun.faces.config;
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
public class WebConfiguration$WebContextInitParameterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "Ljava/lang/Enum<Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("com/sun/faces/config/WebConfiguration$WebContextInitParameter", "com/sun/faces/config/WebConfiguration", "WebContextInitParameter", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("com/sun/faces/config/WebConfiguration$DeprecationLoggingStrategy", "com/sun/faces/config/WebConfiguration", "DeprecationLoggingStrategy", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("com/sun/faces/config/WebConfiguration$FaceletsConfigParamLoggingStrategy", "com/sun/faces/config/WebConfiguration", "FaceletsConfigParamLoggingStrategy", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/config/WebConfiguration$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ManagedBeanFactoryDecorator", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "StateSavingMethod", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FaceletsSuffix", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DefaultSuffix", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "JavaxFacesConfigFiles", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "JavaxFacesProjectStage", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "AlternateLifecycleId", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ResourceExcludes", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NumberOfViews", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NumberOfViewsDeprecated", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NumberOfLogicalViews", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NumberOfLogicalViewsDeprecated", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NumberOfConcurrentFlashUsers", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NumberOfFlashesBetweenFlashReapings", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "InjectionProviderClass", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SerializationProviderClass", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ResponseBufferSize", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FaceletsBufferSize", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FaceletsBufferSizeDeprecated", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ClientStateWriteBufferSize", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ResourceBufferSize", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ExpressionFactory", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ClientStateTimeout", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DefaultResourceMaxAge", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ResourceUpdateCheckPeriod", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CompressableMimeTypes", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DisableUnicodeEscaping", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FaceletsDefaultRefreshPeriod", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FaceletsDefaultRefreshPeriodDeprecated", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FaceletsResourceResolver", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FaceletsResourceResolverDeprecated", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FaceletsViewMappings", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FaceletsViewMappingsDeprecated", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FaceletsLibraries", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FaceletsLibrariesDeprecated", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FaceletsDecorators", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FaceletsDecoratorsDeprecated", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DuplicateJARPattern", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ValidateEmptyFields", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FullStateSavingViewIds", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "AnnotationScanPackages", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FaceletCache", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FaceletsProcessingFileExtensionProcessAs", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ClientWindowMode", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WebAppResourcesDirectory", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WebAppContractsDirectory", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "defaultValue", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "qualifiedName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "alternate", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "deprecated", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "loggingStrategy", "Lcom/sun/faces/config/WebConfiguration$DeprecationLoggingStrategy;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "$VALUES", "[Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/faces/config/WebConfiguration$WebContextInitParameter");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDefaultValue", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "defaultValue", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getQualifiedName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "qualifiedName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getDeprecationLoggingStrategy", "()Lcom/sun/faces/config/WebConfiguration$DeprecationLoggingStrategy;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "loggingStrategy", "Lcom/sun/faces/config/WebConfiguration$DeprecationLoggingStrategy;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLcom/sun/faces/config/WebConfiguration$WebContextInitParameter;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLcom/sun/faces/config/WebConfiguration$WebContextInitParameter;)V", "(Ljava/lang/String;Ljava/lang/String;ZLcom/sun/faces/config/WebConfiguration$WebContextInitParameter;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "qualifiedName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "defaultValue", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "deprecated", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "alternate", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLcom/sun/faces/config/WebConfiguration$WebContextInitParameter;Lcom/sun/faces/config/WebConfiguration$DeprecationLoggingStrategy;)V", "(Ljava/lang/String;Ljava/lang/String;ZLcom/sun/faces/config/WebConfiguration$WebContextInitParameter;Lcom/sun/faces/config/WebConfiguration$DeprecationLoggingStrategy;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLcom/sun/faces/config/WebConfiguration$WebContextInitParameter;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "loggingStrategy", "Lcom/sun/faces/config/WebConfiguration$DeprecationLoggingStrategy;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getAlternate", "()Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "alternate", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "isDeprecated", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "deprecated", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;)Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "getAlternate", "()Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$300", "(Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "isDeprecated", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$WebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ManagedBeanFactoryDecorator");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("com.sun.faces.managedBeanFactoryDecoratorClass");
methodVisitor.visitLdcInsn("");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "ManagedBeanFactoryDecorator", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$WebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("StateSavingMethod");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("jakarta.faces.STATE_SAVING_METHOD");
methodVisitor.visitLdcInsn("server");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "StateSavingMethod", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$WebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FaceletsSuffix");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("jakarta.faces.FACELETS_SUFFIX");
methodVisitor.visitLdcInsn(".xhtml");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "FaceletsSuffix", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$WebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DefaultSuffix");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("jakarta.faces.DEFAULT_SUFFIX");
methodVisitor.visitLdcInsn(".xhtml .view.xml .jsp");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "DefaultSuffix", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$WebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JavaxFacesConfigFiles");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("jakarta.faces.CONFIG_FILES");
methodVisitor.visitLdcInsn("");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "JavaxFacesConfigFiles", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$WebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JavaxFacesProjectStage");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("jakarta.faces.PROJECT_STAGE");
methodVisitor.visitLdcInsn("Production");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "JavaxFacesProjectStage", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$WebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AlternateLifecycleId");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("jakarta.faces.LIFECYCLE_ID");
methodVisitor.visitLdcInsn("");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "AlternateLifecycleId", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$WebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ResourceExcludes");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitLdcInsn("jakarta.faces.RESOURCE_EXCLUDES");
methodVisitor.visitLdcInsn(".class .jsp .jspx .properties .xhtml .groovy");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "ResourceExcludes", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$WebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NumberOfViews");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitLdcInsn("com.sun.faces.numberOfViewsInSession");
methodVisitor.visitLdcInsn("15");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "NumberOfViews", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$WebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NumberOfViewsDeprecated");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitLdcInsn("com.sun.faces.NUMBER_OF_VIEWS_IN_SESSION");
methodVisitor.visitLdcInsn("15");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "NumberOfViews", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLcom/sun/faces/config/WebConfiguration$WebContextInitParameter;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "NumberOfViewsDeprecated", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$WebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NumberOfLogicalViews");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitLdcInsn("com.sun.faces.numberOfLogicalViews");
methodVisitor.visitLdcInsn("15");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "NumberOfLogicalViews", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$WebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NumberOfLogicalViewsDeprecated");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitLdcInsn("com.sun.faces.NUMBER_OF_VIEWS_IN_LOGICAL_VIEW_IN_SESSION");
methodVisitor.visitLdcInsn("15");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "NumberOfLogicalViews", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLcom/sun/faces/config/WebConfiguration$WebContextInitParameter;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "NumberOfLogicalViewsDeprecated", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$WebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NumberOfConcurrentFlashUsers");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitLdcInsn("com.sun.faces.numberOfConcerrentFlashUsers");
methodVisitor.visitLdcInsn("5000");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "NumberOfConcurrentFlashUsers", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$WebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NumberOfFlashesBetweenFlashReapings");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitLdcInsn("com.sun.faces.numberOfFlashesBetweenFlashReapings");
methodVisitor.visitLdcInsn("5000");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "NumberOfFlashesBetweenFlashReapings", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$WebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("InjectionProviderClass");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitLdcInsn("com.sun.faces.injectionProvider");
methodVisitor.visitLdcInsn("");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "InjectionProviderClass", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$WebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SerializationProviderClass");
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitLdcInsn("com.sun.faces.serializationProvider");
methodVisitor.visitLdcInsn("");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "SerializationProviderClass", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$WebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ResponseBufferSize");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitLdcInsn("com.sun.faces.responseBufferSize");
methodVisitor.visitLdcInsn("1024");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "ResponseBufferSize", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$WebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FaceletsBufferSize");
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitLdcInsn("jakarta.faces.FACELETS_BUFFER_SIZE");
methodVisitor.visitLdcInsn("1024");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "FaceletsBufferSize", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$WebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FaceletsBufferSizeDeprecated");
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitLdcInsn("facelets.BUFFER_SIZE");
methodVisitor.visitLdcInsn("1024");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "FaceletsBufferSize", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$FaceletsConfigParamLoggingStrategy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$FaceletsConfigParamLoggingStrategy", "<init>", "(Lcom/sun/faces/config/WebConfiguration$1;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLcom/sun/faces/config/WebConfiguration$WebContextInitParameter;Lcom/sun/faces/config/WebConfiguration$DeprecationLoggingStrategy;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "FaceletsBufferSizeDeprecated", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$WebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ClientStateWriteBufferSize");
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitLdcInsn("com.sun.faces.clientStateWriteBufferSize");
methodVisitor.visitLdcInsn("8192");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "ClientStateWriteBufferSize", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$WebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ResourceBufferSize");
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitLdcInsn("com.sun.faces.resourceBufferSize");
methodVisitor.visitLdcInsn("2048");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "ResourceBufferSize", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$WebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ExpressionFactory");
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitLdcInsn("com.sun.faces.expressionFactory");
methodVisitor.visitLdcInsn("com.sun.el.ExpressionFactoryImpl");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "ExpressionFactory", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$WebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ClientStateTimeout");
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitLdcInsn("com.sun.faces.clientStateTimeout");
methodVisitor.visitLdcInsn("");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "ClientStateTimeout", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$WebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DefaultResourceMaxAge");
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitLdcInsn("com.sun.faces.defaultResourceMaxAge");
methodVisitor.visitLdcInsn("604800000");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "DefaultResourceMaxAge", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$WebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ResourceUpdateCheckPeriod");
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitLdcInsn("com.sun.faces.resourceUpdateCheckPeriod");
methodVisitor.visitLdcInsn("5");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "ResourceUpdateCheckPeriod", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$WebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CompressableMimeTypes");
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitLdcInsn("com.sun.faces.compressableMimeTypes");
methodVisitor.visitLdcInsn("");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "CompressableMimeTypes", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$WebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DisableUnicodeEscaping");
methodVisitor.visitIntInsn(BIPUSH, 26);
methodVisitor.visitLdcInsn("com.sun.faces.disableUnicodeEscaping");
methodVisitor.visitLdcInsn("auto");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "DisableUnicodeEscaping", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$WebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FaceletsDefaultRefreshPeriod");
methodVisitor.visitIntInsn(BIPUSH, 27);
methodVisitor.visitLdcInsn("jakarta.faces.FACELETS_REFRESH_PERIOD");
methodVisitor.visitLdcInsn("2");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "FaceletsDefaultRefreshPeriod", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$WebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FaceletsDefaultRefreshPeriodDeprecated");
methodVisitor.visitIntInsn(BIPUSH, 28);
methodVisitor.visitLdcInsn("facelets.REFRESH_PERIOD");
methodVisitor.visitLdcInsn("2");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "FaceletsDefaultRefreshPeriod", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$FaceletsConfigParamLoggingStrategy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$FaceletsConfigParamLoggingStrategy", "<init>", "(Lcom/sun/faces/config/WebConfiguration$1;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLcom/sun/faces/config/WebConfiguration$WebContextInitParameter;Lcom/sun/faces/config/WebConfiguration$DeprecationLoggingStrategy;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "FaceletsDefaultRefreshPeriodDeprecated", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$WebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FaceletsResourceResolver");
methodVisitor.visitIntInsn(BIPUSH, 29);
methodVisitor.visitLdcInsn("jakarta.faces.FACELETS_RESOURCE_RESOLVER");
methodVisitor.visitLdcInsn("");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "FaceletsResourceResolver", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$WebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FaceletsResourceResolverDeprecated");
methodVisitor.visitIntInsn(BIPUSH, 30);
methodVisitor.visitLdcInsn("facelets.RESOURCE_RESOLVER");
methodVisitor.visitLdcInsn("");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "FaceletsResourceResolver", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$FaceletsConfigParamLoggingStrategy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$FaceletsConfigParamLoggingStrategy", "<init>", "(Lcom/sun/faces/config/WebConfiguration$1;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLcom/sun/faces/config/WebConfiguration$WebContextInitParameter;Lcom/sun/faces/config/WebConfiguration$DeprecationLoggingStrategy;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "FaceletsResourceResolverDeprecated", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$WebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FaceletsViewMappings");
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitLdcInsn("jakarta.faces.FACELETS_VIEW_MAPPINGS");
methodVisitor.visitLdcInsn("");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "FaceletsViewMappings", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$WebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FaceletsViewMappingsDeprecated");
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitLdcInsn("facelets.VIEW_MAPPINGS");
methodVisitor.visitLdcInsn("");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "FaceletsViewMappings", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$FaceletsConfigParamLoggingStrategy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$FaceletsConfigParamLoggingStrategy", "<init>", "(Lcom/sun/faces/config/WebConfiguration$1;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLcom/sun/faces/config/WebConfiguration$WebContextInitParameter;Lcom/sun/faces/config/WebConfiguration$DeprecationLoggingStrategy;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "FaceletsViewMappingsDeprecated", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$WebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FaceletsLibraries");
methodVisitor.visitIntInsn(BIPUSH, 33);
methodVisitor.visitLdcInsn("jakarta.faces.FACELETS_LIBRARIES");
methodVisitor.visitLdcInsn("");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "FaceletsLibraries", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$WebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FaceletsLibrariesDeprecated");
methodVisitor.visitIntInsn(BIPUSH, 34);
methodVisitor.visitLdcInsn("facelets.LIBRARIES");
methodVisitor.visitLdcInsn("");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "FaceletsLibraries", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$FaceletsConfigParamLoggingStrategy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$FaceletsConfigParamLoggingStrategy", "<init>", "(Lcom/sun/faces/config/WebConfiguration$1;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLcom/sun/faces/config/WebConfiguration$WebContextInitParameter;Lcom/sun/faces/config/WebConfiguration$DeprecationLoggingStrategy;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "FaceletsLibrariesDeprecated", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$WebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FaceletsDecorators");
methodVisitor.visitIntInsn(BIPUSH, 35);
methodVisitor.visitLdcInsn("jakarta.faces.FACELETS_DECORATORS");
methodVisitor.visitLdcInsn("");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "FaceletsDecorators", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$WebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FaceletsDecoratorsDeprecated");
methodVisitor.visitIntInsn(BIPUSH, 36);
methodVisitor.visitLdcInsn("facelets.DECORATORS");
methodVisitor.visitLdcInsn("");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "FaceletsDecorators", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$FaceletsConfigParamLoggingStrategy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$FaceletsConfigParamLoggingStrategy", "<init>", "(Lcom/sun/faces/config/WebConfiguration$1;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLcom/sun/faces/config/WebConfiguration$WebContextInitParameter;Lcom/sun/faces/config/WebConfiguration$DeprecationLoggingStrategy;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "FaceletsDecoratorsDeprecated", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$WebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DuplicateJARPattern");
methodVisitor.visitIntInsn(BIPUSH, 37);
methodVisitor.visitLdcInsn("com.sun.faces.duplicateJARPattern");
methodVisitor.visitLdcInsn("");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "DuplicateJARPattern", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$WebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ValidateEmptyFields");
methodVisitor.visitIntInsn(BIPUSH, 38);
methodVisitor.visitLdcInsn("jakarta.faces.VALIDATE_EMPTY_FIELDS");
methodVisitor.visitLdcInsn("auto");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "ValidateEmptyFields", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$WebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FullStateSavingViewIds");
methodVisitor.visitIntInsn(BIPUSH, 39);
methodVisitor.visitLdcInsn("jakarta.faces.FULL_STATE_SAVING_VIEW_IDS");
methodVisitor.visitLdcInsn("");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "FullStateSavingViewIds", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$WebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AnnotationScanPackages");
methodVisitor.visitIntInsn(BIPUSH, 40);
methodVisitor.visitLdcInsn("com.sun.faces.annotationScanPackages");
methodVisitor.visitLdcInsn("");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "AnnotationScanPackages", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$WebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FaceletCache");
methodVisitor.visitIntInsn(BIPUSH, 41);
methodVisitor.visitLdcInsn("com.sun.faces.faceletCache");
methodVisitor.visitLdcInsn("");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "FaceletCache", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$WebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FaceletsProcessingFileExtensionProcessAs");
methodVisitor.visitIntInsn(BIPUSH, 42);
methodVisitor.visitLdcInsn("");
methodVisitor.visitLdcInsn("");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "FaceletsProcessingFileExtensionProcessAs", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$WebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ClientWindowMode");
methodVisitor.visitIntInsn(BIPUSH, 43);
methodVisitor.visitLdcInsn("jakarta.faces.CLIENT_WINDOW_MODE");
methodVisitor.visitLdcInsn("none");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "ClientWindowMode", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$WebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WebAppResourcesDirectory");
methodVisitor.visitIntInsn(BIPUSH, 44);
methodVisitor.visitLdcInsn("jakarta.faces.WEBAPP_RESOURCES_DIRECTORY");
methodVisitor.visitLdcInsn("/resources");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "WebAppResourcesDirectory", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$WebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WebAppContractsDirectory");
methodVisitor.visitIntInsn(BIPUSH, 45);
methodVisitor.visitLdcInsn("jakarta.faces.WEBAPP_CONTRACTS_DIRECTORY");
methodVisitor.visitLdcInsn("/contracts");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "WebAppContractsDirectory", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitIntInsn(BIPUSH, 46);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/sun/faces/config/WebConfiguration$WebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "ManagedBeanFactoryDecorator", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "StateSavingMethod", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "FaceletsSuffix", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "DefaultSuffix", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "JavaxFacesConfigFiles", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "JavaxFacesProjectStage", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "AlternateLifecycleId", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "ResourceExcludes", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "NumberOfViews", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "NumberOfViewsDeprecated", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "NumberOfLogicalViews", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "NumberOfLogicalViewsDeprecated", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "NumberOfConcurrentFlashUsers", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "NumberOfFlashesBetweenFlashReapings", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "InjectionProviderClass", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "SerializationProviderClass", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "ResponseBufferSize", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "FaceletsBufferSize", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "FaceletsBufferSizeDeprecated", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "ClientStateWriteBufferSize", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "ResourceBufferSize", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "ExpressionFactory", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "ClientStateTimeout", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "DefaultResourceMaxAge", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "ResourceUpdateCheckPeriod", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "CompressableMimeTypes", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 26);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "DisableUnicodeEscaping", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 27);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "FaceletsDefaultRefreshPeriod", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 28);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "FaceletsDefaultRefreshPeriodDeprecated", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 29);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "FaceletsResourceResolver", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 30);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "FaceletsResourceResolverDeprecated", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "FaceletsViewMappings", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "FaceletsViewMappingsDeprecated", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 33);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "FaceletsLibraries", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 34);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "FaceletsLibrariesDeprecated", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 35);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "FaceletsDecorators", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 36);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "FaceletsDecoratorsDeprecated", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 37);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "DuplicateJARPattern", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 38);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "ValidateEmptyFields", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 39);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "FullStateSavingViewIds", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 40);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "AnnotationScanPackages", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 41);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "FaceletCache", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 42);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "FaceletsProcessingFileExtensionProcessAs", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 43);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "ClientWindowMode", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 44);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "WebAppResourcesDirectory", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 45);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "WebAppContractsDirectory", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "$VALUES", "[Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(11, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
