package asm.com.sun.faces.taglib.jsf_core;
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
public class ConvertNumberTagDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", null, "com/sun/faces/taglib/jsf_core/AbstractConverterTag", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(-2710405278792415110L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "CONVERTER_ID_EXPR", "Ljavax/el/ValueExpression;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "LOGGER", "Ljava/util/logging/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "currencyCodeExpression", "Ljavax/el/ValueExpression;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "currencySymbolExpression", "Ljavax/el/ValueExpression;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "groupingUsedExpression", "Ljavax/el/ValueExpression;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "integerOnlyExpression", "Ljavax/el/ValueExpression;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "maxFractionDigitsExpression", "Ljavax/el/ValueExpression;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "maxIntegerDigitsExpression", "Ljavax/el/ValueExpression;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "minFractionDigitsExpression", "Ljavax/el/ValueExpression;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "minIntegerDigitsExpression", "Ljavax/el/ValueExpression;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "localeExpression", "Ljavax/el/ValueExpression;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "patternExpression", "Ljavax/el/ValueExpression;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "typeExpression", "Ljavax/el/ValueExpression;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "currencyCode", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "currencySymbol", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "groupingUsed", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "integerOnly", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "maxFractionDigits", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "maxIntegerDigits", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "minFractionDigits", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "minIntegerDigits", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "locale", "Ljava/util/Locale;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "pattern", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "type", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "maxFractionDigitsSpecified", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "maxIntegerDigitsSpecified", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "minFractionDigitsSpecified", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "minIntegerDigitsSpecified", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$assertionsDisabled", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/taglib/jsf_core/AbstractConverterTag", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "init", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "release", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/taglib/jsf_core/AbstractConverterTag", "release", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "init", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "init", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "currencyCode", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "currencyCodeExpression", "Ljavax/el/ValueExpression;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "currencySymbol", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "currencySymbolExpression", "Ljavax/el/ValueExpression;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "groupingUsed", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "groupingUsedExpression", "Ljavax/el/ValueExpression;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "integerOnly", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "integerOnlyExpression", "Ljavax/el/ValueExpression;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "maxFractionDigits", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "maxFractionDigitsExpression", "Ljavax/el/ValueExpression;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "maxFractionDigitsSpecified", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "maxIntegerDigits", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "maxIntegerDigitsExpression", "Ljavax/el/ValueExpression;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "maxIntegerDigitsSpecified", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "minFractionDigits", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "minFractionDigitsExpression", "Ljavax/el/ValueExpression;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "minFractionDigitsSpecified", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "minIntegerDigits", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "minIntegerDigitsExpression", "Ljavax/el/ValueExpression;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "minIntegerDigitsSpecified", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "locale", "Ljava/util/Locale;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "localeExpression", "Ljavax/el/ValueExpression;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "pattern", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "patternExpression", "Ljavax/el/ValueExpression;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("number");
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "type", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "typeExpression", "Ljavax/el/ValueExpression;");
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "CONVERTER_ID_EXPR", "Ljavax/el/ValueExpression;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/faces/context/FacesContext", "getCurrentInstance", "()Ljavax/faces/context/FacesContext;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/FacesContext", "getApplication", "()Ljavax/faces/application/Application;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/application/Application", "getExpressionFactory", "()Ljavax/el/ExpressionFactory;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/FacesContext", "getELContext", "()Ljavax/el/ELContext;", false);
methodVisitor.visitLdcInsn("javax.faces.Number");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/ExpressionFactory", "createValueExpression", "(Ljavax/el/ELContext;Ljava/lang/String;Ljava/lang/Class;)Ljavax/el/ValueExpression;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "CONVERTER_ID_EXPR", "Ljavax/el/ValueExpression;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCurrencyCode", "(Ljavax/el/ValueExpression;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "currencyCodeExpression", "Ljavax/el/ValueExpression;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCurrencySymbol", "(Ljavax/el/ValueExpression;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "currencySymbolExpression", "Ljavax/el/ValueExpression;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setGroupingUsed", "(Ljavax/el/ValueExpression;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "groupingUsedExpression", "Ljavax/el/ValueExpression;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setIntegerOnly", "(Ljavax/el/ValueExpression;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "integerOnlyExpression", "Ljavax/el/ValueExpression;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMaxFractionDigits", "(Ljavax/el/ValueExpression;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "maxFractionDigitsExpression", "Ljavax/el/ValueExpression;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "maxFractionDigitsSpecified", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMaxIntegerDigits", "(Ljavax/el/ValueExpression;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "maxIntegerDigitsExpression", "Ljavax/el/ValueExpression;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "maxIntegerDigitsSpecified", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMinFractionDigits", "(Ljavax/el/ValueExpression;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "minFractionDigitsExpression", "Ljavax/el/ValueExpression;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "minFractionDigitsSpecified", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMinIntegerDigits", "(Ljavax/el/ValueExpression;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "minIntegerDigitsExpression", "Ljavax/el/ValueExpression;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setLocale", "(Ljavax/el/ValueExpression;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "localeExpression", "Ljavax/el/ValueExpression;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setPattern", "(Ljavax/el/ValueExpression;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "patternExpression", "Ljavax/el/ValueExpression;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setType", "(Ljavax/el/ValueExpression;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "typeExpression", "Ljavax/el/ValueExpression;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doStartTag", "()I", null, new String[] { "javax/servlet/jsp/JspException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "CONVERTER_ID_EXPR", "Ljavax/el/ValueExpression;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/taglib/jsf_core/AbstractConverterTag", "setConverterId", "(Ljavax/el/ValueExpression;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/taglib/jsf_core/AbstractConverterTag", "doStartTag", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createConverter", "()Ljavax/faces/convert/Converter;", null, new String[] { "javax/servlet/jsp/JspException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/taglib/jsf_core/AbstractConverterTag", "createConverter", "()Ljavax/faces/convert/Converter;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/faces/convert/NumberConverter");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "$assertionsDisabled", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/AssertionError");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/AssertionError", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/faces/convert/NumberConverter"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "evaluateExpressions", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "currencyCode", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/convert/NumberConverter", "setCurrencyCode", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "currencySymbol", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/convert/NumberConverter", "setCurrencySymbol", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "groupingUsed", "Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/convert/NumberConverter", "setGroupingUsed", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "integerOnly", "Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/convert/NumberConverter", "setIntegerOnly", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "maxFractionDigitsSpecified", "Z");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "maxFractionDigits", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/convert/NumberConverter", "setMaxFractionDigits", "(I)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "maxIntegerDigitsSpecified", "Z");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "maxIntegerDigits", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/convert/NumberConverter", "setMaxIntegerDigits", "(I)V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "minFractionDigitsSpecified", "Z");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "minFractionDigits", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/convert/NumberConverter", "setMinFractionDigits", "(I)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "minIntegerDigitsSpecified", "Z");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "minIntegerDigits", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/convert/NumberConverter", "setMinIntegerDigits", "(I)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "locale", "Ljava/util/Locale;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/convert/NumberConverter", "setLocale", "(Ljava/util/Locale;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "pattern", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/convert/NumberConverter", "setPattern", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "type", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/convert/NumberConverter", "setType", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "evaluateExpressions", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/faces/context/FacesContext", "getCurrentInstance", "()Ljavax/faces/context/FacesContext;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/FacesContext", "getELContext", "()Ljavax/el/ELContext;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "currencyCodeExpression", "Ljavax/el/ValueExpression;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "currencyCodeExpression", "Ljavax/el/ValueExpression;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/el/ELUtils", "evaluateValueExpression", "(Ljavax/el/ValueExpression;Ljavax/el/ELContext;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "currencyCode", "Ljava/lang/String;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"javax/faces/context/FacesContext", "javax/el/ELContext"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "currencySymbolExpression", "Ljavax/el/ValueExpression;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "currencySymbolExpression", "Ljavax/el/ValueExpression;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/el/ELUtils", "evaluateValueExpression", "(Ljavax/el/ValueExpression;Ljavax/el/ELContext;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "currencySymbol", "Ljava/lang/String;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "patternExpression", "Ljavax/el/ValueExpression;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "patternExpression", "Ljavax/el/ValueExpression;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/el/ELUtils", "evaluateValueExpression", "(Ljavax/el/ValueExpression;Ljavax/el/ELContext;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "pattern", "Ljava/lang/String;");
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "typeExpression", "Ljavax/el/ValueExpression;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "typeExpression", "Ljavax/el/ValueExpression;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/el/ELUtils", "evaluateValueExpression", "(Ljavax/el/ValueExpression;Ljavax/el/ELContext;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "type", "Ljava/lang/String;");
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "groupingUsedExpression", "Ljavax/el/ValueExpression;");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "groupingUsedExpression", "Ljavax/el/ValueExpression;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/ValueExpression", "isLiteralText", "()Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "groupingUsedExpression", "Ljavax/el/ValueExpression;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/ValueExpression", "getExpressionString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Ljava/lang/String;)Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "groupingUsed", "Z");
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "groupingUsedExpression", "Ljavax/el/ValueExpression;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/el/ELUtils", "evaluateValueExpression", "(Ljavax/el/ValueExpression;Ljavax/el/ELContext;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Boolean");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "groupingUsed", "Z");
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "integerOnlyExpression", "Ljavax/el/ValueExpression;");
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "integerOnlyExpression", "Ljavax/el/ValueExpression;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/ValueExpression", "isLiteralText", "()Z", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "integerOnlyExpression", "Ljavax/el/ValueExpression;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/ValueExpression", "getExpressionString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Ljava/lang/String;)Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "integerOnly", "Z");
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "integerOnlyExpression", "Ljavax/el/ValueExpression;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/el/ELUtils", "evaluateValueExpression", "(Ljavax/el/ValueExpression;Ljavax/el/ELContext;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Boolean");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "integerOnly", "Z");
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "maxFractionDigitsExpression", "Ljavax/el/ValueExpression;");
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "maxFractionDigitsExpression", "Ljavax/el/ValueExpression;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/ValueExpression", "isLiteralText", "()Z", false);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "maxFractionDigitsExpression", "Ljavax/el/ValueExpression;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/ValueExpression", "getExpressionString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(Ljava/lang/String;)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "maxFractionDigits", "I");
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "maxFractionDigitsExpression", "Ljavax/el/ValueExpression;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/el/ELUtils", "evaluateValueExpression", "(Ljavax/el/ValueExpression;Ljavax/el/ELContext;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Integer");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "maxFractionDigits", "I");
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "maxIntegerDigitsExpression", "Ljavax/el/ValueExpression;");
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label10);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "maxIntegerDigitsExpression", "Ljavax/el/ValueExpression;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/ValueExpression", "isLiteralText", "()Z", false);
Label label11 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label11);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "maxIntegerDigitsExpression", "Ljavax/el/ValueExpression;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/ValueExpression", "getExpressionString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(Ljava/lang/String;)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "maxIntegerDigits", "I");
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "maxIntegerDigitsExpression", "Ljavax/el/ValueExpression;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/el/ELUtils", "evaluateValueExpression", "(Ljavax/el/ValueExpression;Ljavax/el/ELContext;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Integer");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "maxIntegerDigits", "I");
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "minFractionDigitsExpression", "Ljavax/el/ValueExpression;");
Label label12 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label12);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "minFractionDigitsExpression", "Ljavax/el/ValueExpression;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/ValueExpression", "isLiteralText", "()Z", false);
Label label13 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label13);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "minFractionDigitsExpression", "Ljavax/el/ValueExpression;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/ValueExpression", "getExpressionString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(Ljava/lang/String;)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "minFractionDigits", "I");
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "minFractionDigitsExpression", "Ljavax/el/ValueExpression;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/el/ELUtils", "evaluateValueExpression", "(Ljavax/el/ValueExpression;Ljavax/el/ELContext;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Integer");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "minFractionDigits", "I");
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "minIntegerDigitsExpression", "Ljavax/el/ValueExpression;");
Label label14 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label14);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "minIntegerDigitsExpression", "Ljavax/el/ValueExpression;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/ValueExpression", "isLiteralText", "()Z", false);
Label label15 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label15);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "minIntegerDigitsExpression", "Ljavax/el/ValueExpression;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/ValueExpression", "getExpressionString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(Ljava/lang/String;)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "minIntegerDigits", "I");
methodVisitor.visitJumpInsn(GOTO, label14);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "minIntegerDigitsExpression", "Ljavax/el/ValueExpression;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/el/ELUtils", "evaluateValueExpression", "(Ljavax/el/ValueExpression;Ljavax/el/ELContext;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Integer");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "minIntegerDigits", "I");
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "localeExpression", "Ljavax/el/ValueExpression;");
Label label16 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label16);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "localeExpression", "Ljavax/el/ValueExpression;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/ValueExpression", "isLiteralText", "()Z", false);
Label label17 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label17);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "localeExpression", "Ljavax/el/ValueExpression;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/ValueExpression", "getExpressionString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "getLocale", "(Ljava/lang/String;)Ljava/util/Locale;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "locale", "Ljava/util/Locale;");
methodVisitor.visitJumpInsn(GOTO, label16);
methodVisitor.visitLabel(label17);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "localeExpression", "Ljavax/el/ValueExpression;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/el/ELUtils", "evaluateValueExpression", "(Ljavax/el/ValueExpression;Ljavax/el/ELContext;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label18 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label18);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/lang/String");
Label label19 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label19);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "getLocale", "(Ljava/lang/String;)Ljava/util/Locale;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "locale", "Ljava/util/Locale;");
methodVisitor.visitJumpInsn(GOTO, label16);
methodVisitor.visitLabel(label19);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/util/Locale");
Label label20 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label20);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Locale");
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "locale", "Ljava/util/Locale;");
methodVisitor.visitJumpInsn(GOTO, label16);
methodVisitor.visitLabel(label20);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("locale");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("java.lang.String or java.util.Locale");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "LOGGER", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "SEVERE", "Ljava/util/logging/Level;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "isLoggable", "(Ljava/util/logging/Level;)Z", false);
Label label21 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label21);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "LOGGER", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "SEVERE", "Ljava/util/logging/Level;");
methodVisitor.visitLdcInsn("jsf.core.tags.eval_result_not_expected_type");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;[Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label21);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"[Ljava/lang/Object;"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "javax/faces/FacesException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("com.sun.faces.EVAL_ATTR_UNEXPECTED_TYPE");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/util/MessageUtils", "getExceptionMessageString", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/FacesException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label18);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/FacesContext", "getViewRoot", "()Ljavax/faces/component/UIViewRoot;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/UIViewRoot", "getLocale", "()Ljava/util/Locale;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "locale", "Ljava/util/Locale;");
methodVisitor.visitLabel(label16);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_STATIC, "getLocale", "(Ljava/lang/String;)Ljava/util/Locale;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Locale", "getDefault", "()Ljava/util/Locale;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
methodVisitor.visitInsn(ICONST_2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "LOGGER", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "WARNING", "Ljava/util/logging/Level;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "isLoggable", "(Ljava/util/logging/Level;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "LOGGER", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "WARNING", "Ljava/util/logging/Level;");
methodVisitor.visitLdcInsn("jsf.core.taglib.invalid_locale_value");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Locale", "getISOLanguages", "()[Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "sort", "([Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "binarySearch", "([Ljava/lang/Object;Ljava/lang/Object;)I", false);
methodVisitor.visitJumpInsn(IFGE, label2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "LOGGER", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "WARNING", "Ljava/util/logging/Level;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "isLoggable", "(Ljava/util/logging/Level;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "LOGGER", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "WARNING", "Ljava/util/logging/Level;");
methodVisitor.visitLdcInsn("jsf.core.taglib.invalid_language");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/util/Locale");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Locale", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/taglib/jsf_core/ConvertNumberTag;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "desiredAssertionStatus", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "$assertionsDisabled", "Z");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "CONVERTER_ID_EXPR", "Ljavax/el/ValueExpression;");
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/util/FacesLogger", "TAGLIB", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/util/FacesLogger", "getLogger", "()Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/taglib/jsf_core/ConvertNumberTag", "LOGGER", "Ljava/util/logging/Logger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
