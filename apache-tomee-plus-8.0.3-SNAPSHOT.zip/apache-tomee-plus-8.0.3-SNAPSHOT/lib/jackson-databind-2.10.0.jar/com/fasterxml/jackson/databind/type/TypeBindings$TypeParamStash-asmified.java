package asm.com.fasterxml.jackson.databind.type;
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
public class TypeBindings$TypeParamStashDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "com/fasterxml/jackson/databind/type/TypeBindings$TypeParamStash", null, "java/lang/Object", null);

classWriter.visitInnerClass("com/fasterxml/jackson/databind/type/TypeBindings$TypeParamStash", "com/fasterxml/jackson/databind/type/TypeBindings", "TypeParamStash", ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "VARS_ABSTRACT_LIST", "[Ljava/lang/reflect/TypeVariable;", "[Ljava/lang/reflect/TypeVariable<*>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "VARS_COLLECTION", "[Ljava/lang/reflect/TypeVariable;", "[Ljava/lang/reflect/TypeVariable<*>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "VARS_ITERABLE", "[Ljava/lang/reflect/TypeVariable;", "[Ljava/lang/reflect/TypeVariable<*>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "VARS_LIST", "[Ljava/lang/reflect/TypeVariable;", "[Ljava/lang/reflect/TypeVariable<*>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "VARS_ARRAY_LIST", "[Ljava/lang/reflect/TypeVariable;", "[Ljava/lang/reflect/TypeVariable<*>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "VARS_MAP", "[Ljava/lang/reflect/TypeVariable;", "[Ljava/lang/reflect/TypeVariable<*>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "VARS_HASH_MAP", "[Ljava/lang/reflect/TypeVariable;", "[Ljava/lang/reflect/TypeVariable<*>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "VARS_LINKED_HASH_MAP", "[Ljava/lang/reflect/TypeVariable;", "[Ljava/lang/reflect/TypeVariable<*>;", null);
fieldVisitor.visitEnd();
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "paramsFor1", "(Ljava/lang/Class;)[Ljava/lang/reflect/TypeVariable;", "(Ljava/lang/Class<*>;)[Ljava/lang/reflect/TypeVariable<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/Collection;"));
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/type/TypeBindings$TypeParamStash", "VARS_COLLECTION", "[Ljava/lang/reflect/TypeVariable;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/List;"));
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/type/TypeBindings$TypeParamStash", "VARS_LIST", "[Ljava/lang/reflect/TypeVariable;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/ArrayList;"));
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/type/TypeBindings$TypeParamStash", "VARS_ARRAY_LIST", "[Ljava/lang/reflect/TypeVariable;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/AbstractList;"));
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label3);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/type/TypeBindings$TypeParamStash", "VARS_ABSTRACT_LIST", "[Ljava/lang/reflect/TypeVariable;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Iterable;"));
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label4);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/type/TypeBindings$TypeParamStash", "VARS_ITERABLE", "[Ljava/lang/reflect/TypeVariable;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getTypeParameters", "()[Ljava/lang/reflect/TypeVariable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "paramsFor2", "(Ljava/lang/Class;)[Ljava/lang/reflect/TypeVariable;", "(Ljava/lang/Class<*>;)[Ljava/lang/reflect/TypeVariable<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/Map;"));
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/type/TypeBindings$TypeParamStash", "VARS_MAP", "[Ljava/lang/reflect/TypeVariable;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/HashMap;"));
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/type/TypeBindings$TypeParamStash", "VARS_HASH_MAP", "[Ljava/lang/reflect/TypeVariable;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/LinkedHashMap;"));
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/type/TypeBindings$TypeParamStash", "VARS_LINKED_HASH_MAP", "[Ljava/lang/reflect/TypeVariable;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getTypeParameters", "()[Ljava/lang/reflect/TypeVariable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/AbstractList;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getTypeParameters", "()[Ljava/lang/reflect/TypeVariable;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/type/TypeBindings$TypeParamStash", "VARS_ABSTRACT_LIST", "[Ljava/lang/reflect/TypeVariable;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/Collection;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getTypeParameters", "()[Ljava/lang/reflect/TypeVariable;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/type/TypeBindings$TypeParamStash", "VARS_COLLECTION", "[Ljava/lang/reflect/TypeVariable;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Iterable;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getTypeParameters", "()[Ljava/lang/reflect/TypeVariable;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/type/TypeBindings$TypeParamStash", "VARS_ITERABLE", "[Ljava/lang/reflect/TypeVariable;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/List;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getTypeParameters", "()[Ljava/lang/reflect/TypeVariable;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/type/TypeBindings$TypeParamStash", "VARS_LIST", "[Ljava/lang/reflect/TypeVariable;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/ArrayList;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getTypeParameters", "()[Ljava/lang/reflect/TypeVariable;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/type/TypeBindings$TypeParamStash", "VARS_ARRAY_LIST", "[Ljava/lang/reflect/TypeVariable;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/Map;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getTypeParameters", "()[Ljava/lang/reflect/TypeVariable;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/type/TypeBindings$TypeParamStash", "VARS_MAP", "[Ljava/lang/reflect/TypeVariable;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/HashMap;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getTypeParameters", "()[Ljava/lang/reflect/TypeVariable;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/type/TypeBindings$TypeParamStash", "VARS_HASH_MAP", "[Ljava/lang/reflect/TypeVariable;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/LinkedHashMap;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getTypeParameters", "()[Ljava/lang/reflect/TypeVariable;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/type/TypeBindings$TypeParamStash", "VARS_LINKED_HASH_MAP", "[Ljava/lang/reflect/TypeVariable;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
