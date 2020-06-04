package asm.com.fasterxml.jackson.databind.cfg;
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
public class DeserializerFactoryConfigDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", null, "java/lang/Object", new String[] { "java/io/Serializable" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(1L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL | ACC_STATIC, "NO_DESERIALIZERS", "[Lcom/fasterxml/jackson/databind/deser/Deserializers;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL | ACC_STATIC, "NO_MODIFIERS", "[Lcom/fasterxml/jackson/databind/deser/BeanDeserializerModifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL | ACC_STATIC, "NO_ABSTRACT_TYPE_RESOLVERS", "[Lcom/fasterxml/jackson/databind/AbstractTypeResolver;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL | ACC_STATIC, "NO_VALUE_INSTANTIATORS", "[Lcom/fasterxml/jackson/databind/deser/ValueInstantiators;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL | ACC_STATIC, "DEFAULT_KEY_DESERIALIZERS", "[Lcom/fasterxml/jackson/databind/deser/KeyDeserializers;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "_additionalDeserializers", "[Lcom/fasterxml/jackson/databind/deser/Deserializers;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "_additionalKeyDeserializers", "[Lcom/fasterxml/jackson/databind/deser/KeyDeserializers;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "_modifiers", "[Lcom/fasterxml/jackson/databind/deser/BeanDeserializerModifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "_abstractTypeResolvers", "[Lcom/fasterxml/jackson/databind/AbstractTypeResolver;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "_valueInstantiators", "[Lcom/fasterxml/jackson/databind/deser/ValueInstantiators;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "<init>", "([Lcom/fasterxml/jackson/databind/deser/Deserializers;[Lcom/fasterxml/jackson/databind/deser/KeyDeserializers;[Lcom/fasterxml/jackson/databind/deser/BeanDeserializerModifier;[Lcom/fasterxml/jackson/databind/AbstractTypeResolver;[Lcom/fasterxml/jackson/databind/deser/ValueInstantiators;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "([Lcom/fasterxml/jackson/databind/deser/Deserializers;[Lcom/fasterxml/jackson/databind/deser/KeyDeserializers;[Lcom/fasterxml/jackson/databind/deser/BeanDeserializerModifier;[Lcom/fasterxml/jackson/databind/AbstractTypeResolver;[Lcom/fasterxml/jackson/databind/deser/ValueInstantiators;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "NO_DESERIALIZERS", "[Lcom/fasterxml/jackson/databind/deser/Deserializers;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "[Lcom/fasterxml/jackson/databind/deser/Deserializers;", "[Lcom/fasterxml/jackson/databind/deser/KeyDeserializers;", "[Lcom/fasterxml/jackson/databind/deser/BeanDeserializerModifier;", "[Lcom/fasterxml/jackson/databind/AbstractTypeResolver;", "[Lcom/fasterxml/jackson/databind/deser/ValueInstantiators;"}, 1, new Object[] {"com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig"});
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "[Lcom/fasterxml/jackson/databind/deser/Deserializers;", "[Lcom/fasterxml/jackson/databind/deser/KeyDeserializers;", "[Lcom/fasterxml/jackson/databind/deser/BeanDeserializerModifier;", "[Lcom/fasterxml/jackson/databind/AbstractTypeResolver;", "[Lcom/fasterxml/jackson/databind/deser/ValueInstantiators;"}, 2, new Object[] {"com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "[Lcom/fasterxml/jackson/databind/deser/Deserializers;"});
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "_additionalDeserializers", "[Lcom/fasterxml/jackson/databind/deser/Deserializers;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "DEFAULT_KEY_DESERIALIZERS", "[Lcom/fasterxml/jackson/databind/deser/KeyDeserializers;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig"});
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "[Lcom/fasterxml/jackson/databind/deser/Deserializers;", "[Lcom/fasterxml/jackson/databind/deser/KeyDeserializers;", "[Lcom/fasterxml/jackson/databind/deser/BeanDeserializerModifier;", "[Lcom/fasterxml/jackson/databind/AbstractTypeResolver;", "[Lcom/fasterxml/jackson/databind/deser/ValueInstantiators;"}, 2, new Object[] {"com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "[Lcom/fasterxml/jackson/databind/deser/KeyDeserializers;"});
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "_additionalKeyDeserializers", "[Lcom/fasterxml/jackson/databind/deser/KeyDeserializers;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label4);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "NO_MODIFIERS", "[Lcom/fasterxml/jackson/databind/deser/BeanDeserializerModifier;");
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig"});
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "[Lcom/fasterxml/jackson/databind/deser/Deserializers;", "[Lcom/fasterxml/jackson/databind/deser/KeyDeserializers;", "[Lcom/fasterxml/jackson/databind/deser/BeanDeserializerModifier;", "[Lcom/fasterxml/jackson/databind/AbstractTypeResolver;", "[Lcom/fasterxml/jackson/databind/deser/ValueInstantiators;"}, 2, new Object[] {"com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "[Lcom/fasterxml/jackson/databind/deser/BeanDeserializerModifier;"});
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "_modifiers", "[Lcom/fasterxml/jackson/databind/deser/BeanDeserializerModifier;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label6);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "NO_ABSTRACT_TYPE_RESOLVERS", "[Lcom/fasterxml/jackson/databind/AbstractTypeResolver;");
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig"});
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "[Lcom/fasterxml/jackson/databind/deser/Deserializers;", "[Lcom/fasterxml/jackson/databind/deser/KeyDeserializers;", "[Lcom/fasterxml/jackson/databind/deser/BeanDeserializerModifier;", "[Lcom/fasterxml/jackson/databind/AbstractTypeResolver;", "[Lcom/fasterxml/jackson/databind/deser/ValueInstantiators;"}, 2, new Object[] {"com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "[Lcom/fasterxml/jackson/databind/AbstractTypeResolver;"});
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "_abstractTypeResolvers", "[Lcom/fasterxml/jackson/databind/AbstractTypeResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label8);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "NO_VALUE_INSTANTIATORS", "[Lcom/fasterxml/jackson/databind/deser/ValueInstantiators;");
Label label9 = new Label();
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig"});
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "[Lcom/fasterxml/jackson/databind/deser/Deserializers;", "[Lcom/fasterxml/jackson/databind/deser/KeyDeserializers;", "[Lcom/fasterxml/jackson/databind/deser/BeanDeserializerModifier;", "[Lcom/fasterxml/jackson/databind/AbstractTypeResolver;", "[Lcom/fasterxml/jackson/databind/deser/ValueInstantiators;"}, 2, new Object[] {"com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "[Lcom/fasterxml/jackson/databind/deser/ValueInstantiators;"});
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "_valueInstantiators", "[Lcom/fasterxml/jackson/databind/deser/ValueInstantiators;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withAdditionalDeserializers", "(Lcom/fasterxml/jackson/databind/deser/Deserializers;)Lcom/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Cannot pass null Deserializers");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "_additionalDeserializers", "[Lcom/fasterxml/jackson/databind/deser/Deserializers;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/fasterxml/jackson/databind/util/ArrayBuilders", "insertInListNoDup", "([Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/fasterxml/jackson/databind/deser/Deserializers;");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "_additionalKeyDeserializers", "[Lcom/fasterxml/jackson/databind/deser/KeyDeserializers;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "_modifiers", "[Lcom/fasterxml/jackson/databind/deser/BeanDeserializerModifier;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "_abstractTypeResolvers", "[Lcom/fasterxml/jackson/databind/AbstractTypeResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "_valueInstantiators", "[Lcom/fasterxml/jackson/databind/deser/ValueInstantiators;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "<init>", "([Lcom/fasterxml/jackson/databind/deser/Deserializers;[Lcom/fasterxml/jackson/databind/deser/KeyDeserializers;[Lcom/fasterxml/jackson/databind/deser/BeanDeserializerModifier;[Lcom/fasterxml/jackson/databind/AbstractTypeResolver;[Lcom/fasterxml/jackson/databind/deser/ValueInstantiators;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withAdditionalKeyDeserializers", "(Lcom/fasterxml/jackson/databind/deser/KeyDeserializers;)Lcom/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Cannot pass null KeyDeserializers");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "_additionalKeyDeserializers", "[Lcom/fasterxml/jackson/databind/deser/KeyDeserializers;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/fasterxml/jackson/databind/util/ArrayBuilders", "insertInListNoDup", "([Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/fasterxml/jackson/databind/deser/KeyDeserializers;");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "_additionalDeserializers", "[Lcom/fasterxml/jackson/databind/deser/Deserializers;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "_modifiers", "[Lcom/fasterxml/jackson/databind/deser/BeanDeserializerModifier;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "_abstractTypeResolvers", "[Lcom/fasterxml/jackson/databind/AbstractTypeResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "_valueInstantiators", "[Lcom/fasterxml/jackson/databind/deser/ValueInstantiators;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "<init>", "([Lcom/fasterxml/jackson/databind/deser/Deserializers;[Lcom/fasterxml/jackson/databind/deser/KeyDeserializers;[Lcom/fasterxml/jackson/databind/deser/BeanDeserializerModifier;[Lcom/fasterxml/jackson/databind/AbstractTypeResolver;[Lcom/fasterxml/jackson/databind/deser/ValueInstantiators;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withDeserializerModifier", "(Lcom/fasterxml/jackson/databind/deser/BeanDeserializerModifier;)Lcom/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Cannot pass null modifier");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "_modifiers", "[Lcom/fasterxml/jackson/databind/deser/BeanDeserializerModifier;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/fasterxml/jackson/databind/util/ArrayBuilders", "insertInListNoDup", "([Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/fasterxml/jackson/databind/deser/BeanDeserializerModifier;");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "_additionalDeserializers", "[Lcom/fasterxml/jackson/databind/deser/Deserializers;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "_additionalKeyDeserializers", "[Lcom/fasterxml/jackson/databind/deser/KeyDeserializers;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "_abstractTypeResolvers", "[Lcom/fasterxml/jackson/databind/AbstractTypeResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "_valueInstantiators", "[Lcom/fasterxml/jackson/databind/deser/ValueInstantiators;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "<init>", "([Lcom/fasterxml/jackson/databind/deser/Deserializers;[Lcom/fasterxml/jackson/databind/deser/KeyDeserializers;[Lcom/fasterxml/jackson/databind/deser/BeanDeserializerModifier;[Lcom/fasterxml/jackson/databind/AbstractTypeResolver;[Lcom/fasterxml/jackson/databind/deser/ValueInstantiators;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withAbstractTypeResolver", "(Lcom/fasterxml/jackson/databind/AbstractTypeResolver;)Lcom/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Cannot pass null resolver");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "_abstractTypeResolvers", "[Lcom/fasterxml/jackson/databind/AbstractTypeResolver;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/fasterxml/jackson/databind/util/ArrayBuilders", "insertInListNoDup", "([Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/fasterxml/jackson/databind/AbstractTypeResolver;");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "_additionalDeserializers", "[Lcom/fasterxml/jackson/databind/deser/Deserializers;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "_additionalKeyDeserializers", "[Lcom/fasterxml/jackson/databind/deser/KeyDeserializers;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "_modifiers", "[Lcom/fasterxml/jackson/databind/deser/BeanDeserializerModifier;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "_valueInstantiators", "[Lcom/fasterxml/jackson/databind/deser/ValueInstantiators;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "<init>", "([Lcom/fasterxml/jackson/databind/deser/Deserializers;[Lcom/fasterxml/jackson/databind/deser/KeyDeserializers;[Lcom/fasterxml/jackson/databind/deser/BeanDeserializerModifier;[Lcom/fasterxml/jackson/databind/AbstractTypeResolver;[Lcom/fasterxml/jackson/databind/deser/ValueInstantiators;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withValueInstantiators", "(Lcom/fasterxml/jackson/databind/deser/ValueInstantiators;)Lcom/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Cannot pass null resolver");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "_valueInstantiators", "[Lcom/fasterxml/jackson/databind/deser/ValueInstantiators;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/fasterxml/jackson/databind/util/ArrayBuilders", "insertInListNoDup", "([Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/fasterxml/jackson/databind/deser/ValueInstantiators;");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "_additionalDeserializers", "[Lcom/fasterxml/jackson/databind/deser/Deserializers;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "_additionalKeyDeserializers", "[Lcom/fasterxml/jackson/databind/deser/KeyDeserializers;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "_modifiers", "[Lcom/fasterxml/jackson/databind/deser/BeanDeserializerModifier;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "_abstractTypeResolvers", "[Lcom/fasterxml/jackson/databind/AbstractTypeResolver;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "<init>", "([Lcom/fasterxml/jackson/databind/deser/Deserializers;[Lcom/fasterxml/jackson/databind/deser/KeyDeserializers;[Lcom/fasterxml/jackson/databind/deser/BeanDeserializerModifier;[Lcom/fasterxml/jackson/databind/AbstractTypeResolver;[Lcom/fasterxml/jackson/databind/deser/ValueInstantiators;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasDeserializers", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "_additionalDeserializers", "[Lcom/fasterxml/jackson/databind/deser/Deserializers;");
methodVisitor.visitInsn(ARRAYLENGTH);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasKeyDeserializers", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "_additionalKeyDeserializers", "[Lcom/fasterxml/jackson/databind/deser/KeyDeserializers;");
methodVisitor.visitInsn(ARRAYLENGTH);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasDeserializerModifiers", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "_modifiers", "[Lcom/fasterxml/jackson/databind/deser/BeanDeserializerModifier;");
methodVisitor.visitInsn(ARRAYLENGTH);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasAbstractTypeResolvers", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "_abstractTypeResolvers", "[Lcom/fasterxml/jackson/databind/AbstractTypeResolver;");
methodVisitor.visitInsn(ARRAYLENGTH);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasValueInstantiators", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "_valueInstantiators", "[Lcom/fasterxml/jackson/databind/deser/ValueInstantiators;");
methodVisitor.visitInsn(ARRAYLENGTH);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "deserializers", "()Ljava/lang/Iterable;", "()Ljava/lang/Iterable<Lcom/fasterxml/jackson/databind/deser/Deserializers;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/util/ArrayIterator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "_additionalDeserializers", "[Lcom/fasterxml/jackson/databind/deser/Deserializers;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/util/ArrayIterator", "<init>", "([Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "keyDeserializers", "()Ljava/lang/Iterable;", "()Ljava/lang/Iterable<Lcom/fasterxml/jackson/databind/deser/KeyDeserializers;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/util/ArrayIterator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "_additionalKeyDeserializers", "[Lcom/fasterxml/jackson/databind/deser/KeyDeserializers;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/util/ArrayIterator", "<init>", "([Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "deserializerModifiers", "()Ljava/lang/Iterable;", "()Ljava/lang/Iterable<Lcom/fasterxml/jackson/databind/deser/BeanDeserializerModifier;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/util/ArrayIterator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "_modifiers", "[Lcom/fasterxml/jackson/databind/deser/BeanDeserializerModifier;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/util/ArrayIterator", "<init>", "([Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "abstractTypeResolvers", "()Ljava/lang/Iterable;", "()Ljava/lang/Iterable<Lcom/fasterxml/jackson/databind/AbstractTypeResolver;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/util/ArrayIterator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "_abstractTypeResolvers", "[Lcom/fasterxml/jackson/databind/AbstractTypeResolver;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/util/ArrayIterator", "<init>", "([Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "valueInstantiators", "()Ljava/lang/Iterable;", "()Ljava/lang/Iterable<Lcom/fasterxml/jackson/databind/deser/ValueInstantiators;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/util/ArrayIterator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "_valueInstantiators", "[Lcom/fasterxml/jackson/databind/deser/ValueInstantiators;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/util/ArrayIterator", "<init>", "([Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/fasterxml/jackson/databind/deser/Deserializers");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "NO_DESERIALIZERS", "[Lcom/fasterxml/jackson/databind/deser/Deserializers;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/fasterxml/jackson/databind/deser/BeanDeserializerModifier");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "NO_MODIFIERS", "[Lcom/fasterxml/jackson/databind/deser/BeanDeserializerModifier;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/fasterxml/jackson/databind/AbstractTypeResolver");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "NO_ABSTRACT_TYPE_RESOLVERS", "[Lcom/fasterxml/jackson/databind/AbstractTypeResolver;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/fasterxml/jackson/databind/deser/ValueInstantiators");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "NO_VALUE_INSTANTIATORS", "[Lcom/fasterxml/jackson/databind/deser/ValueInstantiators;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/fasterxml/jackson/databind/deser/KeyDeserializers");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/deser/std/StdKeyDeserializers");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/deser/std/StdKeyDeserializers", "<init>", "()V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig", "DEFAULT_KEY_DESERIALIZERS", "[Lcom/fasterxml/jackson/databind/deser/KeyDeserializers;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
