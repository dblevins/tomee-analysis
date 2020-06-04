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
public class WebConfiguration$BooleanWebContextInitParameterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "Ljava/lang/Enum<Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "com/sun/faces/config/WebConfiguration", "BooleanWebContextInitParameter", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("com/sun/faces/config/WebConfiguration$DeprecationLoggingStrategy", "com/sun/faces/config/WebConfiguration", "DeprecationLoggingStrategy", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("com/sun/faces/config/WebConfiguration$FaceletsConfigParamLoggingStrategy", "com/sun/faces/config/WebConfiguration", "FaceletsConfigParamLoggingStrategy", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/config/WebConfiguration$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "AlwaysPerformValidationWhenRequiredTrue", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DisplayConfiguration", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ValidateFacesConfigFiles", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "VerifyFacesConfigObjects", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ForceLoadFacesConfigFiles", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DisableArtifactVersioning", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DisableClientStateEncryption", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DisableFacesServletAutomaticMapping", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EnableClientStateDebugging", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EnableHtmlTagLibraryValidator", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EnableCoreTagLibraryValidator", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PreferXHTMLContentType", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PreferXHTMLContextTypeDeprecated", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CompressViewState", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CompressViewStateDeprecated", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CompressJavaScript", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ExternalizeJavaScriptDeprecated", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EnableJSStyleHiding", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EnableScriptInAttributeValue", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WriteStateAtFormEnd", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EnableLazyBeanValidation", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EnableLoadBundle11Compatibility", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EnableRestoreView11Compatibility", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SerializeServerState", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SerializeServerStateDeprecated", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EnableViewStateIdRendering", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "RegisterConverterPropertyEditors", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DisableFaceletJSFViewHandler", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DisableFaceletJSFViewHandlerDeprecated", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DisableDefaultBeanValidator", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DateTimeConverterUsesSystemTimezone", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EnableHttpMethodRestrictionPhaseListener", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FaceletsSkipComments", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FaceletsSkipCommentsDeprecated", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PartialStateSaving", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "GenerateUniqueServerStateIds", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "InterpretEmptyStringSubmittedValuesAsNull", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "AutoCompleteOffOnViewState", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EnableThreading", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "AllowTextChildren", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CacheResourceModificationTimestamp", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EnableAgressiveSessionDirtying", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EnableDistributable", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EnableFaceletsResourceResolverResolveCompositeComponents", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EnableMissingResourceLibraryDetection", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DisableIdUniquenessCheck", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EnableTransitionTimeNoOpFlash", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ForceAlwaysWriteFlashCookie", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ViewRootPhaseListenerQueuesException", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EnableValidateWholeBean", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EnableWebsocketEndpoint", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DisallowDoctypeDecl", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "alternate", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "qualifiedName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "defaultValue", "Z", null, null);
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
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "$VALUES", "[Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDefaultValue", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "defaultValue", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getQualifiedName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "qualifiedName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getDeprecationLoggingStrategy", "()Lcom/sun/faces/config/WebConfiguration$DeprecationLoggingStrategy;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "loggingStrategy", "Lcom/sun/faces/config/WebConfiguration$DeprecationLoggingStrategy;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", "(Ljava/lang/String;Z)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;ZZLcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;ILjava/lang/String;ZZLcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;)V", "(Ljava/lang/String;ZZLcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "qualifiedName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "defaultValue", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "deprecated", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "alternate", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;ILjava/lang/String;ZZLcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;Lcom/sun/faces/config/WebConfiguration$DeprecationLoggingStrategy;)V", "(Ljava/lang/String;ZZLcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;Lcom/sun/faces/config/WebConfiguration$DeprecationLoggingStrategy;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;ZZLcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "loggingStrategy", "Lcom/sun/faces/config/WebConfiguration$DeprecationLoggingStrategy;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getAlternate", "()Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "alternate", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "isDeprecated", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "deprecated", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "isDeprecated", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$200", "(Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;)Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "getAlternate", "()Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AlwaysPerformValidationWhenRequiredTrue");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("javax.faces.ALWAYS_PERFORM_VALIDATION_WHEN_REQUIRED_IS_TRUE");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "AlwaysPerformValidationWhenRequiredTrue", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DisplayConfiguration");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("com.sun.faces.displayConfiguration");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "DisplayConfiguration", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ValidateFacesConfigFiles");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("com.sun.faces.validateXml");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "ValidateFacesConfigFiles", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("VerifyFacesConfigObjects");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("com.sun.faces.verifyObjects");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "VerifyFacesConfigObjects", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ForceLoadFacesConfigFiles");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("com.sun.faces.forceLoadConfiguration");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "ForceLoadFacesConfigFiles", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DisableArtifactVersioning");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("com.sun.faces.disableVersionTracking");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;ZZLcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "DisableArtifactVersioning", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DisableClientStateEncryption");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("com.sun.faces.disableClientStateEncryption");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "DisableClientStateEncryption", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DisableFacesServletAutomaticMapping");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitLdcInsn("javax.faces.DISABLE_FACESSERVLET_TO_XHTML");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "DisableFacesServletAutomaticMapping", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EnableClientStateDebugging");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitLdcInsn("com.sun.faces.enableClientStateDebugging");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "EnableClientStateDebugging", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EnableHtmlTagLibraryValidator");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitLdcInsn("com.sun.faces.enableHtmlTagLibValidator");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "EnableHtmlTagLibraryValidator", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EnableCoreTagLibraryValidator");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitLdcInsn("com.sun.faces.enableCoreTagLibValidator");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "EnableCoreTagLibraryValidator", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PreferXHTMLContentType");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitLdcInsn("com.sun.faces.preferXHTML");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "PreferXHTMLContentType", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PreferXHTMLContextTypeDeprecated");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitLdcInsn("com.sun.faces.PreferXHTML");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "PreferXHTMLContentType", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;ZZLcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "PreferXHTMLContextTypeDeprecated", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CompressViewState");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitLdcInsn("com.sun.faces.compressViewState");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "CompressViewState", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CompressViewStateDeprecated");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitLdcInsn("com.sun.faces.COMPRESS_STATE");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "CompressViewState", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;ZZLcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "CompressViewStateDeprecated", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CompressJavaScript");
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitLdcInsn("com.sun.faces.compressJavaScript");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "CompressJavaScript", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ExternalizeJavaScriptDeprecated");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitLdcInsn("com.sun.faces.externalizeJavaScript");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;ZZLcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "ExternalizeJavaScriptDeprecated", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EnableJSStyleHiding");
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitLdcInsn("com.sun.faces.enableJSStyleHiding");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "EnableJSStyleHiding", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EnableScriptInAttributeValue");
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitLdcInsn("com.sun.faces.enableScriptsInAttributeValues");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "EnableScriptInAttributeValue", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WriteStateAtFormEnd");
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitLdcInsn("com.sun.faces.writeStateAtFormEnd");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "WriteStateAtFormEnd", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EnableLazyBeanValidation");
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitLdcInsn("com.sun.faces.enableLazyBeanValidation");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "EnableLazyBeanValidation", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EnableLoadBundle11Compatibility");
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitLdcInsn("com.sun.faces.enabledLoadBundle11Compatibility");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "EnableLoadBundle11Compatibility", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EnableRestoreView11Compatibility");
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitLdcInsn("com.sun.faces.enableRestoreView11Compatibility");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "EnableRestoreView11Compatibility", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SerializeServerState");
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitLdcInsn("javax.faces.SERIALIZE_SERVER_STATE");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "SerializeServerState", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SerializeServerStateDeprecated");
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitLdcInsn("com.sun.faces.serializeServerState");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "SerializeServerState", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;ZZLcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "SerializeServerStateDeprecated", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EnableViewStateIdRendering");
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitLdcInsn("com.sun.faces.enableViewStateIdRendering");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "EnableViewStateIdRendering", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RegisterConverterPropertyEditors");
methodVisitor.visitIntInsn(BIPUSH, 26);
methodVisitor.visitLdcInsn("com.sun.faces.registerConverterPropertyEditors");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "RegisterConverterPropertyEditors", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DisableFaceletJSFViewHandler");
methodVisitor.visitIntInsn(BIPUSH, 27);
methodVisitor.visitLdcInsn("javax.faces.DISABLE_FACELET_JSF_VIEWHANDLER");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "DisableFaceletJSFViewHandler", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DisableFaceletJSFViewHandlerDeprecated");
methodVisitor.visitIntInsn(BIPUSH, 28);
methodVisitor.visitLdcInsn("DISABLE_FACELET_JSF_VIEWHANDLER");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "DisableFaceletJSFViewHandler", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;ZZLcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "DisableFaceletJSFViewHandlerDeprecated", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DisableDefaultBeanValidator");
methodVisitor.visitIntInsn(BIPUSH, 29);
methodVisitor.visitLdcInsn("javax.faces.validator.DISABLE_DEFAULT_BEAN_VALIDATOR");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "DisableDefaultBeanValidator", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DateTimeConverterUsesSystemTimezone");
methodVisitor.visitIntInsn(BIPUSH, 30);
methodVisitor.visitLdcInsn("javax.faces.DATETIMECONVERTER_DEFAULT_TIMEZONE_IS_SYSTEM_TIMEZONE");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "DateTimeConverterUsesSystemTimezone", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EnableHttpMethodRestrictionPhaseListener");
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitLdcInsn("com.sun.faces.ENABLE_HTTP_METHOD_RESTRICTION_PHASE_LISTENER");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "EnableHttpMethodRestrictionPhaseListener", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FaceletsSkipComments");
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitLdcInsn("javax.faces.FACELETS_SKIP_COMMENTS");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "FaceletsSkipComments", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FaceletsSkipCommentsDeprecated");
methodVisitor.visitIntInsn(BIPUSH, 33);
methodVisitor.visitLdcInsn("facelets.SKIP_COMMENTS");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "FaceletsSkipComments", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$FaceletsConfigParamLoggingStrategy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$FaceletsConfigParamLoggingStrategy", "<init>", "(Lcom/sun/faces/config/WebConfiguration$1;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;ZZLcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;Lcom/sun/faces/config/WebConfiguration$DeprecationLoggingStrategy;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "FaceletsSkipCommentsDeprecated", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PartialStateSaving");
methodVisitor.visitIntInsn(BIPUSH, 34);
methodVisitor.visitLdcInsn("javax.faces.PARTIAL_STATE_SAVING");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "PartialStateSaving", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("GenerateUniqueServerStateIds");
methodVisitor.visitIntInsn(BIPUSH, 35);
methodVisitor.visitLdcInsn("com.sun.faces.generateUniqueServerStateIds");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "GenerateUniqueServerStateIds", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("InterpretEmptyStringSubmittedValuesAsNull");
methodVisitor.visitIntInsn(BIPUSH, 36);
methodVisitor.visitLdcInsn("javax.faces.INTERPRET_EMPTY_STRING_SUBMITTED_VALUES_AS_NULL");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "InterpretEmptyStringSubmittedValuesAsNull", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AutoCompleteOffOnViewState");
methodVisitor.visitIntInsn(BIPUSH, 37);
methodVisitor.visitLdcInsn("com.sun.faces.autoCompleteOffOnViewState");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "AutoCompleteOffOnViewState", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EnableThreading");
methodVisitor.visitIntInsn(BIPUSH, 38);
methodVisitor.visitLdcInsn("com.sun.faces.enableThreading");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "EnableThreading", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AllowTextChildren");
methodVisitor.visitIntInsn(BIPUSH, 39);
methodVisitor.visitLdcInsn("com.sun.faces.allowTextChildren");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "AllowTextChildren", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CacheResourceModificationTimestamp");
methodVisitor.visitIntInsn(BIPUSH, 40);
methodVisitor.visitLdcInsn("com.sun.faces.cacheResourceModificationTimestamp");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "CacheResourceModificationTimestamp", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EnableAgressiveSessionDirtying");
methodVisitor.visitIntInsn(BIPUSH, 41);
methodVisitor.visitLdcInsn("com.sun.faces.enableAgressiveSessionDirtying");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "EnableAgressiveSessionDirtying", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EnableDistributable");
methodVisitor.visitIntInsn(BIPUSH, 42);
methodVisitor.visitLdcInsn("com.sun.faces.enableDistributable");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "EnableDistributable", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EnableFaceletsResourceResolverResolveCompositeComponents");
methodVisitor.visitIntInsn(BIPUSH, 43);
methodVisitor.visitLdcInsn("com.sun.faces.enableFaceletsResourceResolverCompositeComponents");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "EnableFaceletsResourceResolverResolveCompositeComponents", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EnableMissingResourceLibraryDetection");
methodVisitor.visitIntInsn(BIPUSH, 44);
methodVisitor.visitLdcInsn("com.sun.faces.enableMissingResourceLibraryDetection");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "EnableMissingResourceLibraryDetection", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DisableIdUniquenessCheck");
methodVisitor.visitIntInsn(BIPUSH, 45);
methodVisitor.visitLdcInsn("com.sun.faces.disableIdUniquenessCheck");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "DisableIdUniquenessCheck", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EnableTransitionTimeNoOpFlash");
methodVisitor.visitIntInsn(BIPUSH, 46);
methodVisitor.visitLdcInsn("com.sun.faces.enableTransitionTimeNoOpFlash");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "EnableTransitionTimeNoOpFlash", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ForceAlwaysWriteFlashCookie");
methodVisitor.visitIntInsn(BIPUSH, 47);
methodVisitor.visitLdcInsn("com.sun.faces.forceAlwaysWriteFlashCookie");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "ForceAlwaysWriteFlashCookie", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ViewRootPhaseListenerQueuesException");
methodVisitor.visitIntInsn(BIPUSH, 48);
methodVisitor.visitLdcInsn("javax.faces.VIEWROOT_PHASE_LISTENER_QUEUES_EXCEPTIONS");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "ViewRootPhaseListenerQueuesException", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EnableValidateWholeBean");
methodVisitor.visitIntInsn(BIPUSH, 49);
methodVisitor.visitLdcInsn("javax.faces.validator.ENABLE_VALIDATE_WHOLE_BEAN");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "EnableValidateWholeBean", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EnableWebsocketEndpoint");
methodVisitor.visitIntInsn(BIPUSH, 50);
methodVisitor.visitLdcInsn("javax.faces.ENABLE_WEBSOCKET_ENDPOINT");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "EnableWebsocketEndpoint", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DisallowDoctypeDecl");
methodVisitor.visitIntInsn(BIPUSH, 51);
methodVisitor.visitLdcInsn("com.sun.faces.disallowDoctypeDecl");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "DisallowDoctypeDecl", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitIntInsn(BIPUSH, 52);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "AlwaysPerformValidationWhenRequiredTrue", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "DisplayConfiguration", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "ValidateFacesConfigFiles", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "VerifyFacesConfigObjects", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "ForceLoadFacesConfigFiles", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "DisableArtifactVersioning", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "DisableClientStateEncryption", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "DisableFacesServletAutomaticMapping", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "EnableClientStateDebugging", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "EnableHtmlTagLibraryValidator", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "EnableCoreTagLibraryValidator", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "PreferXHTMLContentType", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "PreferXHTMLContextTypeDeprecated", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "CompressViewState", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "CompressViewStateDeprecated", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "CompressJavaScript", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "ExternalizeJavaScriptDeprecated", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "EnableJSStyleHiding", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "EnableScriptInAttributeValue", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "WriteStateAtFormEnd", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "EnableLazyBeanValidation", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "EnableLoadBundle11Compatibility", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "EnableRestoreView11Compatibility", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "SerializeServerState", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "SerializeServerStateDeprecated", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "EnableViewStateIdRendering", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 26);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "RegisterConverterPropertyEditors", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 27);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "DisableFaceletJSFViewHandler", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 28);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "DisableFaceletJSFViewHandlerDeprecated", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 29);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "DisableDefaultBeanValidator", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 30);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "DateTimeConverterUsesSystemTimezone", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "EnableHttpMethodRestrictionPhaseListener", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "FaceletsSkipComments", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 33);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "FaceletsSkipCommentsDeprecated", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 34);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "PartialStateSaving", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 35);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "GenerateUniqueServerStateIds", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 36);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "InterpretEmptyStringSubmittedValuesAsNull", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 37);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "AutoCompleteOffOnViewState", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 38);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "EnableThreading", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 39);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "AllowTextChildren", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 40);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "CacheResourceModificationTimestamp", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 41);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "EnableAgressiveSessionDirtying", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 42);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "EnableDistributable", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 43);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "EnableFaceletsResourceResolverResolveCompositeComponents", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 44);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "EnableMissingResourceLibraryDetection", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 45);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "DisableIdUniquenessCheck", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 46);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "EnableTransitionTimeNoOpFlash", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 47);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "ForceAlwaysWriteFlashCookie", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 48);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "ViewRootPhaseListenerQueuesException", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 49);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "EnableValidateWholeBean", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 50);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "EnableWebsocketEndpoint", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 51);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "DisallowDoctypeDecl", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "$VALUES", "[Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(11, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
