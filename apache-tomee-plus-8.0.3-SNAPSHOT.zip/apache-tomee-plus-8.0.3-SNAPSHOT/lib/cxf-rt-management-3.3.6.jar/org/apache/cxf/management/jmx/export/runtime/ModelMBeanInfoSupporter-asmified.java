package asm.org.apache.cxf.management.jmx.export.runtime;
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
public class ModelMBeanInfoSupporterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/management/jmx/export/runtime/ModelMBeanInfoSupporter", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "attributes", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Ljavax/management/modelmbean/ModelMBeanAttributeInfo;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "notifications", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Ljavax/management/modelmbean/ModelMBeanNotificationInfo;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "constructors", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/reflect/Constructor<*>;Ljavax/management/modelmbean/ModelMBeanConstructorInfo;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "operations", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Ljavax/management/modelmbean/ModelMBeanOperationInfo;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/management/jmx/export/runtime/ModelMBeanInfoSupporter", "attributes", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/management/jmx/export/runtime/ModelMBeanInfoSupporter", "notifications", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/management/jmx/export/runtime/ModelMBeanInfoSupporter", "constructors", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/management/jmx/export/runtime/ModelMBeanInfoSupporter", "operations", "Ljava/util/Map;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "clear", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/management/jmx/export/runtime/ModelMBeanInfoSupporter", "attributes", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "clear", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/management/jmx/export/runtime/ModelMBeanInfoSupporter", "notifications", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "clear", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/management/jmx/export/runtime/ModelMBeanInfoSupporter", "constructors", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "clear", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/management/jmx/export/runtime/ModelMBeanInfoSupporter", "operations", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "clear", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addModelMBeanMethod", "(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljavax/management/Descriptor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/management/MBeanParameterInfo");
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 9);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"[Ljavax/management/MBeanParameterInfo;", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitJumpInsn(IF_ICMPGE, label0);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitTypeInsn(NEW, "javax/management/MBeanParameterInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/management/MBeanParameterInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitIincInsn(9, 1);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/management/jmx/export/runtime/ModelMBeanInfoSupporter", "operations", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "javax/management/modelmbean/ModelMBeanOperationInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/management/modelmbean/ModelMBeanOperationInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;[Ljavax/management/MBeanParameterInfo;Ljava/lang/String;ILjavax/management/Descriptor;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(10, 10);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addModelMBeanNotification", "([Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljavax/management/Descriptor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/management/jmx/export/runtime/ModelMBeanInfoSupporter", "notifications", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "javax/management/modelmbean/ModelMBeanNotificationInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/management/modelmbean/ModelMBeanNotificationInfo", "<init>", "([Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljavax/management/Descriptor;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "checkAttribute", "(Ljava/lang/String;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/management/jmx/export/runtime/ModelMBeanInfoSupporter", "attributes", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "containsKey", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addModelMBeanAttribute", "(Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljavax/management/Descriptor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/management/jmx/export/runtime/ModelMBeanInfoSupporter", "attributes", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "javax/management/modelmbean/ModelMBeanAttributeInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/management/modelmbean/ModelMBeanAttributeInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjavax/management/Descriptor;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(11, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addModelMBeanConstructor", "(Ljava/lang/reflect/Constructor;Ljava/lang/String;Ljavax/management/Descriptor;)V", "(Ljava/lang/reflect/Constructor<*>;Ljava/lang/String;Ljavax/management/Descriptor;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/management/jmx/export/runtime/ModelMBeanInfoSupporter", "constructors", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "javax/management/modelmbean/ModelMBeanConstructorInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/management/modelmbean/ModelMBeanConstructorInfo", "<init>", "(Ljava/lang/String;Ljava/lang/reflect/Constructor;Ljavax/management/Descriptor;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "buildModelMBeanInfo", "(Ljavax/management/Descriptor;)Ljavax/management/modelmbean/ModelMBeanInfo;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/management/jmx/export/runtime/ModelMBeanInfoSupporter", "operations", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "values", "()Ljava/util/Collection;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/management/jmx/export/runtime/ModelMBeanInfoSupporter", "operations", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "values", "()Ljava/util/Collection;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "size", "()I", true);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/management/modelmbean/ModelMBeanOperationInfo");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljavax/management/modelmbean/ModelMBeanOperationInfo;");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/management/jmx/export/runtime/ModelMBeanInfoSupporter", "attributes", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "values", "()Ljava/util/Collection;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/management/jmx/export/runtime/ModelMBeanInfoSupporter", "attributes", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "values", "()Ljava/util/Collection;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "size", "()I", true);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/management/modelmbean/ModelMBeanAttributeInfo");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljavax/management/modelmbean/ModelMBeanAttributeInfo;");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/management/jmx/export/runtime/ModelMBeanInfoSupporter", "constructors", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "values", "()Ljava/util/Collection;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/management/jmx/export/runtime/ModelMBeanInfoSupporter", "constructors", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "values", "()Ljava/util/Collection;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "size", "()I", true);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/management/modelmbean/ModelMBeanConstructorInfo");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljavax/management/modelmbean/ModelMBeanConstructorInfo;");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/management/jmx/export/runtime/ModelMBeanInfoSupporter", "notifications", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "values", "()Ljava/util/Collection;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/management/jmx/export/runtime/ModelMBeanInfoSupporter", "notifications", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "values", "()Ljava/util/Collection;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "size", "()I", true);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/management/modelmbean/ModelMBeanNotificationInfo");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljavax/management/modelmbean/ModelMBeanNotificationInfo;");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitTypeInsn(NEW, "javax/management/modelmbean/ModelMBeanInfoSupport");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("javax.management.modelmbean.ModelMBeanInfo");
methodVisitor.visitLdcInsn("description");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/management/modelmbean/ModelMBeanInfoSupport", "<init>", "(Ljava/lang/String;Ljava/lang/String;[Ljavax/management/modelmbean/ModelMBeanAttributeInfo;[Ljavax/management/modelmbean/ModelMBeanConstructorInfo;[Ljavax/management/modelmbean/ModelMBeanOperationInfo;[Ljavax/management/modelmbean/ModelMBeanNotificationInfo;Ljavax/management/Descriptor;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(9, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "buildAttributeDescriptor", "(Lorg/apache/cxf/management/annotation/ManagedAttribute;Ljava/lang/String;ZZZ)Ljavax/management/Descriptor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/management/modelmbean/DescriptorSupport");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/management/modelmbean/DescriptorSupport", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitLdcInsn("name");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/management/Descriptor", "setField", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitLdcInsn("descriptorType");
methodVisitor.visitLdcInsn("attribute");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/management/Descriptor", "setField", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ILOAD, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitLdcInsn("getMethod");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("is");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/management/Descriptor", "setField", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/management/Descriptor"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitLdcInsn("getMethod");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("get");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/management/Descriptor", "setField", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 5);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitLdcInsn("setMethod");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("set");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/management/Descriptor", "setField", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/management/annotation/ManagedAttribute", "currencyTimeLimit", "()I", true);
methodVisitor.visitInsn(ICONST_M1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLT, label3);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitLdcInsn("currencyTimeLimit");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/management/annotation/ManagedAttribute", "currencyTimeLimit", "()I", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/management/Descriptor", "setField", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/management/annotation/ManagedAttribute", "persistPolicy", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFLE, label4);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitLdcInsn("persistPolicy");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/management/annotation/ManagedAttribute", "persistPolicy", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/management/Descriptor", "setField", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/management/annotation/ManagedAttribute", "persistPeriod", "()I", true);
methodVisitor.visitInsn(ICONST_M1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLT, label5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitLdcInsn("persistPeriod");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/management/annotation/ManagedAttribute", "persistPeriod", "()I", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/management/Descriptor", "setField", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/management/annotation/ManagedAttribute", "defaultValue", "()Ljava/lang/String;", true);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitLdcInsn("default");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/management/annotation/ManagedAttribute", "defaultValue", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/management/Descriptor", "setField", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "buildOperationDescriptor", "(Lorg/apache/cxf/management/annotation/ManagedOperation;Ljava/lang/String;)Ljavax/management/Descriptor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/management/modelmbean/DescriptorSupport");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/management/modelmbean/DescriptorSupport", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("name");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/management/Descriptor", "setField", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("descriptorType");
methodVisitor.visitLdcInsn("operation");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/management/Descriptor", "setField", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("role");
methodVisitor.visitLdcInsn("operation");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/management/Descriptor", "setField", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/management/annotation/ManagedOperation", "description", "()Ljava/lang/String;", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("displayName");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/management/annotation/ManagedOperation", "description", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/management/Descriptor", "setField", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/management/Descriptor"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/management/annotation/ManagedOperation", "currencyTimeLimit", "()I", true);
methodVisitor.visitInsn(ICONST_M1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLT, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("currencyTimeLimit");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/management/annotation/ManagedOperation", "currencyTimeLimit", "()I", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/management/Descriptor", "setField", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "buildAttributeOperationDescriptor", "(Ljava/lang/String;)Ljavax/management/Descriptor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/management/modelmbean/DescriptorSupport");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/management/modelmbean/DescriptorSupport", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("name");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/management/Descriptor", "setField", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("descriptorType");
methodVisitor.visitLdcInsn("operation");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/management/Descriptor", "setField", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("set");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "indexOf", "(Ljava/lang/String;)I", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("role");
methodVisitor.visitLdcInsn("setter");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/management/Descriptor", "setField", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/management/Descriptor"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("role");
methodVisitor.visitLdcInsn("getter");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/management/Descriptor", "setField", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "buildMBeanDescriptor", "(Lorg/apache/cxf/management/annotation/ManagedResource;)Ljavax/management/Descriptor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/management/modelmbean/DescriptorSupport");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/management/modelmbean/DescriptorSupport", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/management/annotation/ManagedResource", "componentName", "()Ljava/lang/String;", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("name");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/management/annotation/ManagedResource", "componentName", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/management/Descriptor", "setField", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/management/Descriptor"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("descriptorType");
methodVisitor.visitLdcInsn("mbean");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/management/Descriptor", "setField", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/management/annotation/ManagedResource", "description", "()Ljava/lang/String;", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("displayName");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/management/annotation/ManagedResource", "description", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/management/Descriptor", "setField", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/management/annotation/ManagedResource", "persistLocation", "()Ljava/lang/String;", true);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("persistLocation");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/management/annotation/ManagedResource", "persistLocation", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/management/Descriptor", "setField", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/management/annotation/ManagedResource", "persistName", "()Ljava/lang/String;", true);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("persistName");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/management/annotation/ManagedResource", "persistName", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/management/Descriptor", "setField", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/management/annotation/ManagedResource", "log", "()Z", true);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("log");
methodVisitor.visitLdcInsn("true");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/management/Descriptor", "setField", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("log");
methodVisitor.visitLdcInsn("false");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/management/Descriptor", "setField", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/management/annotation/ManagedResource", "persistPolicy", "()Ljava/lang/String;", true);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("persistPolicy");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/management/annotation/ManagedResource", "persistPolicy", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/management/Descriptor", "setField", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/management/annotation/ManagedResource", "persistPeriod", "()I", true);
methodVisitor.visitInsn(ICONST_M1);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLT, label7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("persistPeriod");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/management/annotation/ManagedResource", "persistPeriod", "()I", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/management/Descriptor", "setField", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/management/annotation/ManagedResource", "logFile", "()Ljava/lang/String;", true);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label8);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("logFile");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/management/annotation/ManagedResource", "logFile", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/management/Descriptor", "setField", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/management/annotation/ManagedResource", "currencyTimeLimit", "()I", true);
methodVisitor.visitInsn(ICONST_M1);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLT, label9);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("currencyTimeLimit");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/management/annotation/ManagedResource", "currencyTimeLimit", "()I", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/management/Descriptor", "setField", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}