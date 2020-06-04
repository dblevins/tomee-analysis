package asm.com.sun.xml.bind.v2.runtime;
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
public class JaxBeanInfoDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "<BeanT:Ljava/lang/Object;>Ljava/lang/Object;", "java/lang/Object", null);

classWriter.visitInnerClass("com/sun/xml/bind/v2/runtime/JaxBeanInfo$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "isNilIncluded", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "flag", "S", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "FLAG_IS_ELEMENT", "S", null, new Integer(1));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "FLAG_IS_IMMUTABLE", "S", null, new Integer(2));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "FLAG_HAS_ELEMENT_ONLY_CONTENTMODEL", "S", null, new Integer(4));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "FLAG_HAS_BEFORE_UNMARSHAL_METHOD", "S", null, new Integer(8));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "FLAG_HAS_AFTER_UNMARSHAL_METHOD", "S", null, new Integer(16));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "FLAG_HAS_BEFORE_MARSHAL_METHOD", "S", null, new Integer(32));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "FLAG_HAS_AFTER_MARSHAL_METHOD", "S", null, new Integer(64));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "FLAG_HAS_LIFECYCLE_EVENTS", "S", null, new Integer(128));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "lcm", "Lcom/sun/xml/bind/v2/runtime/LifecycleMethods;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL, "jaxbType", "Ljava/lang/Class;", "Ljava/lang/Class<TBeanT;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "typeName", "Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "unmarshalEventParams", "[Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "marshalEventParams", "[Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "logger", "Ljava/util/logging/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;Lcom/sun/xml/bind/v2/model/runtime/RuntimeTypeInfo;Ljava/lang/Class;[Ljavax/xml/namespace/QName;ZZZ)V", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;Lcom/sun/xml/bind/v2/model/runtime/RuntimeTypeInfo;Ljava/lang/Class<TBeanT;>;[Ljavax/xml/namespace/QName;ZZZ)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "<init>", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;Lcom/sun/xml/bind/v2/model/runtime/RuntimeTypeInfo;Ljava/lang/Class;Ljava/lang/Object;ZZZ)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;Lcom/sun/xml/bind/v2/model/runtime/RuntimeTypeInfo;Ljava/lang/Class;Ljavax/xml/namespace/QName;ZZZ)V", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;Lcom/sun/xml/bind/v2/model/runtime/RuntimeTypeInfo;Ljava/lang/Class<TBeanT;>;Ljavax/xml/namespace/QName;ZZZ)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "<init>", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;Lcom/sun/xml/bind/v2/model/runtime/RuntimeTypeInfo;Ljava/lang/Class;Ljava/lang/Object;ZZZ)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;Lcom/sun/xml/bind/v2/model/runtime/RuntimeTypeInfo;Ljava/lang/Class;ZZZ)V", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;Lcom/sun/xml/bind/v2/model/runtime/RuntimeTypeInfo;Ljava/lang/Class<TBeanT;>;ZZZ)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "<init>", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;Lcom/sun/xml/bind/v2/model/runtime/RuntimeTypeInfo;Ljava/lang/Class;Ljava/lang/Object;ZZZ)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;Lcom/sun/xml/bind/v2/model/runtime/RuntimeTypeInfo;Ljava/lang/Class;Ljava/lang/Object;ZZZ)V", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;Lcom/sun/xml/bind/v2/model/runtime/RuntimeTypeInfo;Ljava/lang/Class<TBeanT;>;Ljava/lang/Object;ZZZ)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "isNilIncluded", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "lcm", "Lcom/sun/xml/bind/v2/runtime/LifecycleMethods;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl", "beanInfos", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "jaxbType", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "typeName", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 5);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"com/sun/xml/bind/v2/runtime/JaxBeanInfo", "com/sun/xml/bind/v2/runtime/JAXBContextImpl", "com/sun/xml/bind/v2/model/runtime/RuntimeTypeInfo", "java/lang/Class", "java/lang/Object", Opcodes.INTEGER, Opcodes.INTEGER, Opcodes.INTEGER}, 1, new Object[] {"com/sun/xml/bind/v2/runtime/JaxBeanInfo"});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"com/sun/xml/bind/v2/runtime/JaxBeanInfo", "com/sun/xml/bind/v2/runtime/JAXBContextImpl", "com/sun/xml/bind/v2/model/runtime/RuntimeTypeInfo", "java/lang/Class", "java/lang/Object", Opcodes.INTEGER, Opcodes.INTEGER, Opcodes.INTEGER}, 2, new Object[] {"com/sun/xml/bind/v2/runtime/JaxBeanInfo", Opcodes.INTEGER});
methodVisitor.visitVarInsn(ILOAD, 6);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitInsn(ICONST_2);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"com/sun/xml/bind/v2/runtime/JaxBeanInfo", "com/sun/xml/bind/v2/runtime/JAXBContextImpl", "com/sun/xml/bind/v2/model/runtime/RuntimeTypeInfo", "java/lang/Class", "java/lang/Object", Opcodes.INTEGER, Opcodes.INTEGER, Opcodes.INTEGER}, 2, new Object[] {"com/sun/xml/bind/v2/runtime/JaxBeanInfo", Opcodes.INTEGER});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"com/sun/xml/bind/v2/runtime/JaxBeanInfo", "com/sun/xml/bind/v2/runtime/JAXBContextImpl", "com/sun/xml/bind/v2/model/runtime/RuntimeTypeInfo", "java/lang/Class", "java/lang/Object", Opcodes.INTEGER, Opcodes.INTEGER, Opcodes.INTEGER}, 3, new Object[] {"com/sun/xml/bind/v2/runtime/JaxBeanInfo", Opcodes.INTEGER, Opcodes.INTEGER});
methodVisitor.visitInsn(IOR);
methodVisitor.visitVarInsn(ILOAD, 7);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitIntInsn(SIPUSH, 128);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"com/sun/xml/bind/v2/runtime/JaxBeanInfo", "com/sun/xml/bind/v2/runtime/JAXBContextImpl", "com/sun/xml/bind/v2/model/runtime/RuntimeTypeInfo", "java/lang/Class", "java/lang/Object", Opcodes.INTEGER, Opcodes.INTEGER, Opcodes.INTEGER}, 2, new Object[] {"com/sun/xml/bind/v2/runtime/JaxBeanInfo", Opcodes.INTEGER});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"com/sun/xml/bind/v2/runtime/JaxBeanInfo", "com/sun/xml/bind/v2/runtime/JAXBContextImpl", "com/sun/xml/bind/v2/model/runtime/RuntimeTypeInfo", "java/lang/Class", "java/lang/Object", Opcodes.INTEGER, Opcodes.INTEGER, Opcodes.INTEGER}, 3, new Object[] {"com/sun/xml/bind/v2/runtime/JaxBeanInfo", Opcodes.INTEGER, Opcodes.INTEGER});
methodVisitor.visitInsn(IOR);
methodVisitor.visitInsn(I2S);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "flag", "S");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "hasBeforeUnmarshalMethod", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "flag", "S");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(IAND);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "hasAfterUnmarshalMethod", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "flag", "S");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitInsn(IAND);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "hasBeforeMarshalMethod", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "flag", "S");
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitInsn(IAND);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "hasAfterMarshalMethod", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "flag", "S");
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitInsn(IAND);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "isElement", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "flag", "S");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IAND);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "isImmutable", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "flag", "S");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IAND);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "hasElementOnlyContentModel", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "flag", "S");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(IAND);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_FINAL, "hasElementOnlyContentModel", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "flag", "S");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(IOR);
methodVisitor.visitInsn(I2S);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "flag", "S");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "flag", "S");
methodVisitor.visitIntInsn(BIPUSH, -5);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(I2S);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "flag", "S");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isNilIncluded", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "isNilIncluded", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lookForLifecycleMethods", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "flag", "S");
methodVisitor.visitIntInsn(SIPUSH, 128);
methodVisitor.visitInsn(IAND);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getElementNamespaceURI", "(Ljava/lang/Object;)Ljava/lang/String;", "(TBeanT;)Ljava/lang/String;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getElementLocalName", "(Ljava/lang/Object;)Ljava/lang/String;", "(TBeanT;)Ljava/lang/String;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTypeNames", "()Ljava/util/Collection;", "()Ljava/util/Collection<Ljavax/xml/namespace/QName;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "typeName", "Ljava/lang/Object;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptyList", "()Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "typeName", "Ljava/lang/Object;");
methodVisitor.visitTypeInsn(INSTANCEOF, "javax/xml/namespace/QName");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "typeName", "Ljava/lang/Object;");
methodVisitor.visitTypeInsn(CHECKCAST, "javax/xml/namespace/QName");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "singletonList", "(Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "typeName", "Ljava/lang/Object;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTypeName", "(Ljava/lang/Object;)Ljavax/xml/namespace/QName;", "(TBeanT;)Ljavax/xml/namespace/QName;", null);
methodVisitor.visitAnnotableParameterCount(1, false);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "typeName", "Ljava/lang/Object;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "typeName", "Ljava/lang/Object;");
methodVisitor.visitTypeInsn(INSTANCEOF, "javax/xml/namespace/QName");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "typeName", "Ljava/lang/Object;");
methodVisitor.visitTypeInsn(CHECKCAST, "javax/xml/namespace/QName");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "typeName", "Ljava/lang/Object;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljavax/xml/namespace/QName;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createInstance", "(Lcom/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext;)Ljava/lang/Object;", "(Lcom/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext;)TBeanT;", new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "java/lang/InstantiationException", "org/xml/sax/SAXException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "reset", "(Ljava/lang/Object;Lcom/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext;)Z", "(TBeanT;Lcom/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext;)Z", new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getId", "(Ljava/lang/Object;Lcom/sun/xml/bind/v2/runtime/XMLSerializer;)Ljava/lang/String;", "(TBeanT;Lcom/sun/xml/bind/v2/runtime/XMLSerializer;)Ljava/lang/String;", new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "serializeBody", "(Ljava/lang/Object;Lcom/sun/xml/bind/v2/runtime/XMLSerializer;)V", "(TBeanT;Lcom/sun/xml/bind/v2/runtime/XMLSerializer;)V", new String[] { "org/xml/sax/SAXException", "java/io/IOException", "javax/xml/stream/XMLStreamException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "serializeAttributes", "(Ljava/lang/Object;Lcom/sun/xml/bind/v2/runtime/XMLSerializer;)V", "(TBeanT;Lcom/sun/xml/bind/v2/runtime/XMLSerializer;)V", new String[] { "org/xml/sax/SAXException", "java/io/IOException", "javax/xml/stream/XMLStreamException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "serializeRoot", "(Ljava/lang/Object;Lcom/sun/xml/bind/v2/runtime/XMLSerializer;)V", "(TBeanT;Lcom/sun/xml/bind/v2/runtime/XMLSerializer;)V", new String[] { "org/xml/sax/SAXException", "java/io/IOException", "javax/xml/stream/XMLStreamException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "serializeURIs", "(Ljava/lang/Object;Lcom/sun/xml/bind/v2/runtime/XMLSerializer;)V", "(TBeanT;Lcom/sun/xml/bind/v2/runtime/XMLSerializer;)V", new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getLoader", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;Z)Lcom/sun/xml/bind/v2/runtime/unmarshaller/Loader;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTransducer", "()Lcom/sun/xml/bind/v2/runtime/Transducer;", "()Lcom/sun/xml/bind/v2/runtime/Transducer<TBeanT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "link", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "wrapUp", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getDeclaredMethods", "(Ljava/lang/Class;)[Ljava/lang/reflect/Method;", "(Ljava/lang/Class<TBeanT;>;)[Ljava/lang/reflect/Method;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/JaxBeanInfo$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/JaxBeanInfo$1", "<init>", "(Lcom/sun/xml/bind/v2/runtime/JaxBeanInfo;Ljava/lang/Class;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AccessController", "doPrivileged", "(Ljava/security/PrivilegedAction;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/reflect/Method;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_FINAL, "setLifecycleFlags", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/SecurityException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "jaxbType", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "lcm", "Lcom/sun/xml/bind/v2/runtime/LifecycleMethods;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/LifecycleMethods");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/LifecycleMethods", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "lcm", "Lcom/sun/xml/bind/v2/runtime/LifecycleMethods;");
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Class"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "getDeclaredMethods", "(Ljava/lang/Class;)[Ljava/lang/reflect/Method;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label4 = new Label();
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"[Ljava/lang/reflect/Method;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "lcm", "Lcom/sun/xml/bind/v2/runtime/LifecycleMethods;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/LifecycleMethods", "beforeUnmarshal", "Ljava/lang/reflect/Method;");
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitLdcInsn("beforeUnmarshal");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "unmarshalEventParams", "[Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "match", "(Ljava/lang/reflect/Method;[Ljava/lang/Class;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "cacheLifecycleMethod", "(Ljava/lang/reflect/Method;S)V", false);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/reflect/Method", "java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "lcm", "Lcom/sun/xml/bind/v2/runtime/LifecycleMethods;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/LifecycleMethods", "afterUnmarshal", "Ljava/lang/reflect/Method;");
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitLdcInsn("afterUnmarshal");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "unmarshalEventParams", "[Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "match", "(Ljava/lang/reflect/Method;[Ljava/lang/Class;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "cacheLifecycleMethod", "(Ljava/lang/reflect/Method;S)V", false);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "lcm", "Lcom/sun/xml/bind/v2/runtime/LifecycleMethods;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/LifecycleMethods", "beforeMarshal", "Ljava/lang/reflect/Method;");
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label8);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitLdcInsn("beforeMarshal");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "marshalEventParams", "[Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "match", "(Ljava/lang/reflect/Method;[Ljava/lang/Class;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "cacheLifecycleMethod", "(Ljava/lang/reflect/Method;S)V", false);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "lcm", "Lcom/sun/xml/bind/v2/runtime/LifecycleMethods;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/LifecycleMethods", "afterMarshal", "Ljava/lang/reflect/Method;");
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label9);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitLdcInsn("afterMarshal");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "marshalEventParams", "[Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "match", "(Ljava/lang/reflect/Method;[Ljava/lang/Class;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "cacheLifecycleMethod", "(Ljava/lang/reflect/Method;S)V", false);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getSuperclass", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
Label label10 = new Label();
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/SecurityException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "logger", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "WARNING", "Ljava/util/logging/Level;");
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "UNABLE_TO_DISCOVER_EVENTHANDLER", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "jaxbType", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/Messages", "format", "([Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "match", "(Ljava/lang/reflect/Method;[Ljava/lang/Class;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "getParameterTypes", "()[Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "equals", "([Ljava/lang/Object;[Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "cacheLifecycleMethod", "(Ljava/lang/reflect/Method;S)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "lcm", "Lcom/sun/xml/bind/v2/runtime/LifecycleMethods;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/LifecycleMethods");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/LifecycleMethods", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "lcm", "Lcom/sun/xml/bind/v2/runtime/LifecycleMethods;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "setAccessible", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "flag", "S");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(IOR);
methodVisitor.visitInsn(I2S);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "flag", "S");
methodVisitor.visitVarInsn(ILOAD, 2);
Label label1 = new Label();
Label label2 = new Label();
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitLookupSwitchInsn(label5, new int[] { 8, 16, 32, 64 }, new Label[] { label1, label2, label3, label4 });
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "lcm", "Lcom/sun/xml/bind/v2/runtime/LifecycleMethods;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/LifecycleMethods", "beforeUnmarshal", "Ljava/lang/reflect/Method;");
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "lcm", "Lcom/sun/xml/bind/v2/runtime/LifecycleMethods;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/LifecycleMethods", "afterUnmarshal", "Ljava/lang/reflect/Method;");
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "lcm", "Lcom/sun/xml/bind/v2/runtime/LifecycleMethods;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/LifecycleMethods", "beforeMarshal", "Ljava/lang/reflect/Method;");
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "lcm", "Lcom/sun/xml/bind/v2/runtime/LifecycleMethods;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/LifecycleMethods", "afterMarshal", "Ljava/lang/reflect/Method;");
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getLifecycleMethods", "()Lcom/sun/xml/bind/v2/runtime/LifecycleMethods;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "lcm", "Lcom/sun/xml/bind/v2/runtime/LifecycleMethods;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "invokeBeforeUnmarshalMethod", "(Lcom/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallerImpl;Ljava/lang/Object;Ljava/lang/Object;)V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "getLifecycleMethods", "()Lcom/sun/xml/bind/v2/runtime/LifecycleMethods;", false);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/LifecycleMethods", "beforeUnmarshal", "Ljava/lang/reflect/Method;");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "invokeUnmarshallCallback", "(Ljava/lang/reflect/Method;Ljava/lang/Object;Lcom/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallerImpl;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "invokeAfterUnmarshalMethod", "(Lcom/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallerImpl;Ljava/lang/Object;Ljava/lang/Object;)V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "getLifecycleMethods", "()Lcom/sun/xml/bind/v2/runtime/LifecycleMethods;", false);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/LifecycleMethods", "afterUnmarshal", "Ljava/lang/reflect/Method;");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "invokeUnmarshallCallback", "(Ljava/lang/reflect/Method;Ljava/lang/Object;Lcom/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallerImpl;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "invokeUnmarshallCallback", "(Ljava/lang/reflect/Method;Ljava/lang/Object;Lcom/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallerImpl;Ljava/lang/Object;)V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/IllegalAccessException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "java/lang/reflect/InvocationTargetException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "invoke", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/IllegalAccessException"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext", "getInstance", "()Lcom/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext", "handleError", "(Ljava/lang/Exception;Z)V", false);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/reflect/InvocationTargetException"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext", "getInstance", "()Lcom/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext", "handleError", "(Ljava/lang/Exception;Z)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/xml/bind/Unmarshaller;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Object;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "unmarshalEventParams", "[Ljava/lang/Class;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/xml/bind/Marshaller;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "marshalEventParams", "[Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/Util", "getClassLogger", "()Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "logger", "Ljava/util/logging/Logger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
