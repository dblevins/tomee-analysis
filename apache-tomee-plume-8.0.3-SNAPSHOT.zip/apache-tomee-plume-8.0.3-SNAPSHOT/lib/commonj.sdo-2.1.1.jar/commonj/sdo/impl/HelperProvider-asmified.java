package asm.commonj.sdo.impl;
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
public class HelperProviderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "commonj/sdo/impl/HelperProvider", null, "java/lang/Object", null);

classWriter.visitInnerClass("commonj/sdo/impl/HelperProvider$DefaultHelperContext", "commonj/sdo/impl/HelperProvider", "DefaultHelperContext", ACC_STATIC);

classWriter.visitInnerClass("commonj/sdo/impl/ExternalizableDelegator$Resolvable", "commonj/sdo/impl/ExternalizableDelegator", "Resolvable", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_STATIC, "INSTANCE", "Lcommonj/sdo/impl/HelperProvider;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "defaultContext", "Lcommonj/sdo/helper/HelperContext;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "getHelperProviderImpl", "()Lcommonj/sdo/impl/HelperProvider;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitLdcInsn("commonj.sdo.impl.HelperProviderImpl");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Class", "forName", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "newInstance", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "commonj/sdo/impl/HelperProvider");
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitTypeInsn(NEW, "java/lang/RuntimeException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/RuntimeException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getCopyHelper", "()Lcommonj/sdo/helper/CopyHelper;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "commonj/sdo/impl/HelperProvider", "INSTANCE", "Lcommonj/sdo/impl/HelperProvider;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "commonj/sdo/impl/HelperProvider", "copyHelper", "()Lcommonj/sdo/helper/CopyHelper;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getDataFactory", "()Lcommonj/sdo/helper/DataFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "commonj/sdo/impl/HelperProvider", "INSTANCE", "Lcommonj/sdo/impl/HelperProvider;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "commonj/sdo/impl/HelperProvider", "dataFactory", "()Lcommonj/sdo/helper/DataFactory;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getDataHelper", "()Lcommonj/sdo/helper/DataHelper;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "commonj/sdo/impl/HelperProvider", "INSTANCE", "Lcommonj/sdo/impl/HelperProvider;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "commonj/sdo/impl/HelperProvider", "dataHelper", "()Lcommonj/sdo/helper/DataHelper;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getEqualityHelper", "()Lcommonj/sdo/helper/EqualityHelper;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "commonj/sdo/impl/HelperProvider", "INSTANCE", "Lcommonj/sdo/impl/HelperProvider;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "commonj/sdo/impl/HelperProvider", "equalityHelper", "()Lcommonj/sdo/helper/EqualityHelper;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getTypeHelper", "()Lcommonj/sdo/helper/TypeHelper;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "commonj/sdo/impl/HelperProvider", "INSTANCE", "Lcommonj/sdo/impl/HelperProvider;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "commonj/sdo/impl/HelperProvider", "typeHelper", "()Lcommonj/sdo/helper/TypeHelper;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getXMLHelper", "()Lcommonj/sdo/helper/XMLHelper;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "commonj/sdo/impl/HelperProvider", "INSTANCE", "Lcommonj/sdo/impl/HelperProvider;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "commonj/sdo/impl/HelperProvider", "xmlHelper", "()Lcommonj/sdo/helper/XMLHelper;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getXSDHelper", "()Lcommonj/sdo/helper/XSDHelper;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "commonj/sdo/impl/HelperProvider", "INSTANCE", "Lcommonj/sdo/impl/HelperProvider;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "commonj/sdo/impl/HelperProvider", "xsdHelper", "()Lcommonj/sdo/helper/XSDHelper;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createResolvable", "()Lcommonj/sdo/impl/ExternalizableDelegator$Resolvable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "commonj/sdo/impl/HelperProvider", "INSTANCE", "Lcommonj/sdo/impl/HelperProvider;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "commonj/sdo/impl/HelperProvider", "resolvable", "()Lcommonj/sdo/impl/ExternalizableDelegator$Resolvable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createResolvable", "(Ljava/lang/Object;)Lcommonj/sdo/impl/ExternalizableDelegator$Resolvable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "commonj/sdo/impl/HelperProvider", "INSTANCE", "Lcommonj/sdo/impl/HelperProvider;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "commonj/sdo/impl/HelperProvider", "resolvable", "(Ljava/lang/Object;)Lcommonj/sdo/impl/ExternalizableDelegator$Resolvable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_ABSTRACT, "copyHelper", "()Lcommonj/sdo/helper/CopyHelper;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_ABSTRACT, "dataFactory", "()Lcommonj/sdo/helper/DataFactory;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_ABSTRACT, "dataHelper", "()Lcommonj/sdo/helper/DataHelper;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_ABSTRACT, "equalityHelper", "()Lcommonj/sdo/helper/EqualityHelper;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_ABSTRACT, "typeHelper", "()Lcommonj/sdo/helper/TypeHelper;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_ABSTRACT, "xmlHelper", "()Lcommonj/sdo/helper/XMLHelper;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_ABSTRACT, "xsdHelper", "()Lcommonj/sdo/helper/XSDHelper;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_ABSTRACT, "resolvable", "()Lcommonj/sdo/impl/ExternalizableDelegator$Resolvable;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_ABSTRACT, "resolvable", "(Ljava/lang/Object;)Lcommonj/sdo/impl/ExternalizableDelegator$Resolvable;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getDefaultContext", "()Lcommonj/sdo/helper/HelperContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "commonj/sdo/impl/HelperProvider", "INSTANCE", "Lcommonj/sdo/impl/HelperProvider;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "commonj/sdo/impl/HelperProvider", "helperContext", "()Lcommonj/sdo/helper/HelperContext;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "helperContext", "()Lcommonj/sdo/helper/HelperContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "commonj/sdo/impl/HelperProvider", "defaultContext", "Lcommonj/sdo/helper/HelperContext;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "commonj/sdo/impl/HelperProvider", "getHelperProviderImpl", "()Lcommonj/sdo/impl/HelperProvider;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "commonj/sdo/impl/HelperProvider", "INSTANCE", "Lcommonj/sdo/impl/HelperProvider;");
methodVisitor.visitTypeInsn(NEW, "commonj/sdo/impl/HelperProvider$DefaultHelperContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "commonj/sdo/impl/HelperProvider$DefaultHelperContext", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "commonj/sdo/impl/HelperProvider", "defaultContext", "Lcommonj/sdo/helper/HelperContext;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
