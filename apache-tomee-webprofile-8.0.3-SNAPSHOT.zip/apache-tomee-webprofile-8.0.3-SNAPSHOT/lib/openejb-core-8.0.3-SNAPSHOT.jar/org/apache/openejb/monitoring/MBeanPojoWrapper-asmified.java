package asm.org.apache.openejb.monitoring;
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
public class MBeanPojoWrapperDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/monitoring/MBeanPojoWrapper", null, "java/lang/Object", new String[] { "javax/management/DynamicMBean" });

classWriter.visitInnerClass("org/apache/openejb/monitoring/MBeanPojoWrapper$1", null, null, ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "delegate", "Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "name", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "info", "Ljavax/management/MBeanInfo;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "attributeMap", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Ljava/beans/PropertyDescriptor;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "SUPPORTED_PROPERTY_TYPES", "Ljava/util/Set;", "Ljava/util/Set<Ljava/lang/Class<*>;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/monitoring/MBeanPojoWrapper", "attributeMap", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/monitoring/MBeanPojoWrapper", "name", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/NullPointerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Delegate cannot be null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/NullPointerException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/openejb/monitoring/MBeanPojoWrapper", "java/lang/String", "java/lang/Object"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/monitoring/MBeanPojoWrapper", "delegate", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/monitoring/MBeanPojoWrapper", "scan", "(Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "scan", "(Ljava/lang/Class;)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "javax/management/IntrospectionException");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/beans/IntrospectionException");
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/beans/Introspector", "getBeanInfo", "(Ljava/lang/Class;)Ljava/beans/BeanInfo;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/beans/BeanInfo", "getPropertyDescriptors", "()[Ljava/beans/PropertyDescriptor;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 6);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 7);
Label label6 = new Label();
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/apache/openejb/monitoring/MBeanPojoWrapper", "java/lang/Class", "java/util/List", "java/beans/BeanInfo", "[Ljava/beans/PropertyDescriptor;", "[Ljava/beans/PropertyDescriptor;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitJumpInsn(IF_ICMPGE, label4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/beans/PropertyDescriptor", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/beans/PropertyDescriptor", "getPropertyType", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/monitoring/MBeanPojoWrapper", "isSupported", "(Ljava/lang/Class;)Z", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNE, label7);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"java/beans/PropertyDescriptor", "java/lang/String", "java/lang/Class"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/MBeanPojoWrapper", "attributeMap", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "javax/management/MBeanAttributeInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitLdcInsn("");
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/beans/PropertyDescriptor", "getReadMethod", "()Ljava/lang/reflect/Method;", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/management/MBeanAttributeInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"javax/management/IntrospectionException"});
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitIincInsn(7, 1);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/openejb/monitoring/MBeanPojoWrapper", "java/lang/Class", "java/util/List"}, 0, new Object[] {});
Label label9 = new Label();
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/beans/IntrospectionException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "javax/management/MBeanInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/MBeanPojoWrapper", "name", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("Auto-created by OpenEJB");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "size", "()I", true);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/management/MBeanAttributeInfo");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljavax/management/MBeanAttributeInfo;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/management/MBeanOperationInfo");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/management/MBeanNotificationInfo");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/management/MBeanInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;[Ljavax/management/MBeanAttributeInfo;[Ljavax/management/MBeanConstructorInfo;[Ljavax/management/MBeanOperationInfo;[Ljavax/management/MBeanNotificationInfo;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/monitoring/MBeanPojoWrapper", "info", "Ljavax/management/MBeanInfo;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(9, 12);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "isSupported", "(Ljava/lang/Class;)Z", "(Ljava/lang/Class<*>;)Z", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/monitoring/MBeanPojoWrapper", "SUPPORTED_PROPERTY_TYPES", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "contains", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttribute", "(Ljava/lang/String;)Ljava/lang/Object;", null, new String[] { "javax/management/AttributeNotFoundException", "javax/management/MBeanException", "javax/management/ReflectionException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/IllegalAccessException");
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/reflect/InvocationTargetException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/MBeanPojoWrapper", "attributeMap", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "containsKey", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "javax/management/AttributeNotFoundException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/management/AttributeNotFoundException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/MBeanPojoWrapper", "attributeMap", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/beans/PropertyDescriptor");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/beans/PropertyDescriptor", "getReadMethod", "()Ljava/lang/reflect/Method;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/MBeanPojoWrapper", "delegate", "Ljava/lang/Object;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "invoke", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/ReflectiveOperationException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "javax/management/MBeanException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/management/MBeanException", "<init>", "(Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAttribute", "(Ljavax/management/Attribute;)V", null, new String[] { "javax/management/AttributeNotFoundException", "javax/management/InvalidAttributeValueException", "javax/management/MBeanException", "javax/management/ReflectionException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttributes", "([Ljava/lang/String;)Ljavax/management/AttributeList;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitTypeInsn(NEW, "javax/management/AttributeList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/management/AttributeList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 5);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/openejb/monitoring/MBeanPojoWrapper", "[Ljava/lang/String;", "javax/management/AttributeList", "[Ljava/lang/String;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 4);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "javax/management/Attribute");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/monitoring/MBeanPojoWrapper", "getAttribute", "(Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/management/Attribute", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/management/AttributeList", "add", "(Ljavax/management/Attribute;)V", false);
methodVisitor.visitLabel(label1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/apache/openejb/monitoring/MBeanPojoWrapper", "[Ljava/lang/String;", "javax/management/AttributeList", "[Ljava/lang/String;", Opcodes.INTEGER, Opcodes.INTEGER, "java/lang/String"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitIincInsn(5, 1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAttributes", "(Ljavax/management/AttributeList;)Ljavax/management/AttributeList;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "invoke", "(Ljava/lang/String;[Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;", null, new String[] { "javax/management/MBeanException", "javax/management/ReflectionException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMBeanInfo", "()Ljavax/management/MBeanInfo;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/MBeanPojoWrapper", "info", "Ljavax/management/MBeanInfo;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/monitoring/MBeanPojoWrapper$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/monitoring/MBeanPojoWrapper$1", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/monitoring/MBeanPojoWrapper", "SUPPORTED_PROPERTY_TYPES", "Ljava/util/Set;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
