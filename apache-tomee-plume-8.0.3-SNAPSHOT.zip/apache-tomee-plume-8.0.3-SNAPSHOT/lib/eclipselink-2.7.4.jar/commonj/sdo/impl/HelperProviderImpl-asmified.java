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
public class HelperProviderImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "commonj/sdo/impl/HelperProviderImpl", null, "commonj/sdo/impl/HelperProvider", null);

classWriter.visitInnerClass("commonj/sdo/impl/ExternalizableDelegator$Resolvable", "commonj/sdo/impl/ExternalizableDelegator", "Resolvable", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "xmlHelper", "Lorg/eclipse/persistence/sdo/helper/SDOXMLHelper;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "typeHelper", "Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "xsdHelper", "Lorg/eclipse/persistence/sdo/helper/SDOXSDHelper;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "dataFactory", "Lorg/eclipse/persistence/sdo/helper/SDODataFactory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "dataHelper", "Lorg/eclipse/persistence/sdo/helper/SDODataHelper;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "copyHelper", "Lorg/eclipse/persistence/sdo/helper/SDOCopyHelper;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "equalityHelper", "Lorg/eclipse/persistence/sdo/helper/SDOEqualityHelper;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegator", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "commonj/sdo/impl/HelperProviderImpl", "xmlHelper", "Lorg/eclipse/persistence/sdo/helper/SDOXMLHelper;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegator", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "commonj/sdo/impl/HelperProviderImpl", "typeHelper", "Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegator", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "commonj/sdo/impl/HelperProviderImpl", "xsdHelper", "Lorg/eclipse/persistence/sdo/helper/SDOXSDHelper;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/helper/delegates/SDODataFactoryDelegator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/delegates/SDODataFactoryDelegator", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "commonj/sdo/impl/HelperProviderImpl", "dataFactory", "Lorg/eclipse/persistence/sdo/helper/SDODataFactory;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/helper/SDODataHelper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/SDODataHelper", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "commonj/sdo/impl/HelperProviderImpl", "dataHelper", "Lorg/eclipse/persistence/sdo/helper/SDODataHelper;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/helper/SDOCopyHelper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/SDOCopyHelper", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "commonj/sdo/impl/HelperProviderImpl", "copyHelper", "Lorg/eclipse/persistence/sdo/helper/SDOCopyHelper;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/helper/SDOEqualityHelper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/SDOEqualityHelper", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "commonj/sdo/impl/HelperProviderImpl", "equalityHelper", "Lorg/eclipse/persistence/sdo/helper/SDOEqualityHelper;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "commonj/sdo/impl/HelperProvider", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "copyHelper", "()Lcommonj/sdo/helper/CopyHelper;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "commonj/sdo/impl/HelperProviderImpl", "copyHelper", "Lorg/eclipse/persistence/sdo/helper/SDOCopyHelper;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "dataFactory", "()Lcommonj/sdo/helper/DataFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "commonj/sdo/impl/HelperProviderImpl", "dataFactory", "Lorg/eclipse/persistence/sdo/helper/SDODataFactory;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "dataHelper", "()Lcommonj/sdo/helper/DataHelper;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "commonj/sdo/impl/HelperProviderImpl", "dataHelper", "Lorg/eclipse/persistence/sdo/helper/SDODataHelper;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "equalityHelper", "()Lcommonj/sdo/helper/EqualityHelper;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "commonj/sdo/impl/HelperProviderImpl", "equalityHelper", "Lorg/eclipse/persistence/sdo/helper/SDOEqualityHelper;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "typeHelper", "()Lcommonj/sdo/helper/TypeHelper;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "commonj/sdo/impl/HelperProviderImpl", "typeHelper", "Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "xmlHelper", "()Lcommonj/sdo/helper/XMLHelper;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "commonj/sdo/impl/HelperProviderImpl", "xmlHelper", "Lorg/eclipse/persistence/sdo/helper/SDOXMLHelper;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "xsdHelper", "()Lcommonj/sdo/helper/XSDHelper;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "commonj/sdo/impl/HelperProviderImpl", "xsdHelper", "Lorg/eclipse/persistence/sdo/helper/SDOXSDHelper;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "resolvable", "()Lcommonj/sdo/impl/ExternalizableDelegator$Resolvable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/SDOResolvable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "commonj/sdo/impl/HelperProvider", "getDefaultContext", "()Lcommonj/sdo/helper/HelperContext;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/SDOResolvable", "<init>", "(Lcommonj/sdo/helper/HelperContext;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "resolvable", "(Ljava/lang/Object;)Lcommonj/sdo/impl/ExternalizableDelegator$Resolvable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/SDOResolvable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "commonj/sdo/impl/HelperProvider", "getDefaultContext", "()Lcommonj/sdo/helper/HelperContext;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/SDOResolvable", "<init>", "(Ljava/lang/Object;Lcommonj/sdo/helper/HelperContext;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
