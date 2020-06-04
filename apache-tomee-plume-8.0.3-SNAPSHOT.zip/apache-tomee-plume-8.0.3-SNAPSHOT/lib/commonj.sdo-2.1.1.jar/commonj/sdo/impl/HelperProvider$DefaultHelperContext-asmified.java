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
public class HelperProvider$DefaultHelperContextDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_SUPER, "commonj/sdo/impl/HelperProvider$DefaultHelperContext", null, "java/lang/Object", new String[] { "commonj/sdo/helper/HelperContext" });

classWriter.visitInnerClass("commonj/sdo/impl/HelperProvider$DefaultHelperContext", "commonj/sdo/impl/HelperProvider", "DefaultHelperContext", ACC_STATIC);

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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCopyHelper", "()Lcommonj/sdo/helper/CopyHelper;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "commonj/sdo/impl/HelperProvider", "INSTANCE", "Lcommonj/sdo/impl/HelperProvider;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "commonj/sdo/impl/HelperProvider", "copyHelper", "()Lcommonj/sdo/helper/CopyHelper;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDataFactory", "()Lcommonj/sdo/helper/DataFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "commonj/sdo/impl/HelperProvider", "INSTANCE", "Lcommonj/sdo/impl/HelperProvider;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "commonj/sdo/impl/HelperProvider", "dataFactory", "()Lcommonj/sdo/helper/DataFactory;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDataHelper", "()Lcommonj/sdo/helper/DataHelper;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "commonj/sdo/impl/HelperProvider", "INSTANCE", "Lcommonj/sdo/impl/HelperProvider;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "commonj/sdo/impl/HelperProvider", "dataHelper", "()Lcommonj/sdo/helper/DataHelper;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEqualityHelper", "()Lcommonj/sdo/helper/EqualityHelper;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "commonj/sdo/impl/HelperProvider", "INSTANCE", "Lcommonj/sdo/impl/HelperProvider;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "commonj/sdo/impl/HelperProvider", "equalityHelper", "()Lcommonj/sdo/helper/EqualityHelper;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTypeHelper", "()Lcommonj/sdo/helper/TypeHelper;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "commonj/sdo/impl/HelperProvider", "INSTANCE", "Lcommonj/sdo/impl/HelperProvider;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "commonj/sdo/impl/HelperProvider", "typeHelper", "()Lcommonj/sdo/helper/TypeHelper;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getXMLHelper", "()Lcommonj/sdo/helper/XMLHelper;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "commonj/sdo/impl/HelperProvider", "INSTANCE", "Lcommonj/sdo/impl/HelperProvider;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "commonj/sdo/impl/HelperProvider", "xmlHelper", "()Lcommonj/sdo/helper/XMLHelper;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getXSDHelper", "()Lcommonj/sdo/helper/XSDHelper;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "commonj/sdo/impl/HelperProvider", "INSTANCE", "Lcommonj/sdo/impl/HelperProvider;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "commonj/sdo/impl/HelperProvider", "xsdHelper", "()Lcommonj/sdo/helper/XSDHelper;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
