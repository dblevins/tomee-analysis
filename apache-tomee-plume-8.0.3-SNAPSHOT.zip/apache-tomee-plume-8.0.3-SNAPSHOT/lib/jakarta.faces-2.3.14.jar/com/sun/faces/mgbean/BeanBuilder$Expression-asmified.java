package asm.com.sun.faces.mgbean;
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
public class BeanBuilder$ExpressionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "com/sun/faces/mgbean/BeanBuilder$Expression", null, "java/lang/Object", null);

classWriter.visitInnerClass("com/sun/faces/el/ELUtils$Scope", "com/sun/faces/el/ELUtils", "Scope", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("com/sun/faces/mgbean/BeanBuilder$Expression", "com/sun/faces/mgbean/BeanBuilder", "Expression", ACC_PROTECTED);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "expressionString", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "expectedType", "Ljava/lang/Class;", "Ljava/lang/Class<*>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "ve", "Ljakarta/el/ValueExpression;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "validateLifespanRuntime", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "segment", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lcom/sun/faces/mgbean/BeanBuilder;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/sun/faces/mgbean/BeanBuilder;Ljava/lang/String;Ljava/lang/Class;)V", "(Ljava/lang/String;Ljava/lang/Class<*>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/mgbean/BeanBuilder$Expression", "this$0", "Lcom/sun/faces/mgbean/BeanBuilder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/mgbean/BeanBuilder$Expression", "validateLifespanRuntime", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/mgbean/BeanBuilder$Expression", "segment", "[Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/mgbean/BeanBuilder$Expression", "expressionString", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/mgbean/BeanBuilder$Expression", "expectedType", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/BeanBuilder$Expression", "expressionString", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/mgbean/SharedUtils", "isExpression", "(Ljava/lang/String;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/BeanBuilder$Expression", "expressionString", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/el/ELUtils", "getExpressionsFromString", "(Ljava/lang/String;)Ljava/util/List;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "isEmpty", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"com/sun/faces/mgbean/BeanBuilder$Expression", "com/sun/faces/mgbean/BeanBuilder", "java/lang/String", "java/lang/Class", "java/util/List", "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/BeanBuilder$Expression", "segment", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/el/ELUtils", "getScope", "(Ljava/lang/String;[Ljava/lang/String;)Lcom/sun/faces/el/ELUtils$Scope;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/BeanBuilder$Expression", "segment", "[Ljava/lang/String;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/mgbean/BeanBuilder", "access$000", "(Lcom/sun/faces/mgbean/BeanBuilder;)Ljava/util/List;", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "(I)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/mgbean/BeanBuilder", "access$002", "(Lcom/sun/faces/mgbean/BeanBuilder;Ljava/util/List;)Ljava/util/List;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/mgbean/BeanBuilder", "access$000", "(Lcom/sun/faces/mgbean/BeanBuilder;)Ljava/util/List;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/BeanBuilder$Expression", "segment", "[Ljava/lang/String;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "contains", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/mgbean/BeanBuilder", "access$000", "(Lcom/sun/faces/mgbean/BeanBuilder;)Ljava/util/List;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/BeanBuilder$Expression", "segment", "[Ljava/lang/String;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/BeanBuilder$Expression", "segment", "[Ljava/lang/String;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/BeanBuilder", "beanInfo", "Lcom/sun/faces/mgbean/ManagedBeanInfo;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/mgbean/ManagedBeanInfo", "getScope", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/mgbean/SharedUtils", "isExpression", "(Ljava/lang/String;)Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNE, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/BeanBuilder$Expression", "expressionString", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/el/ELUtils", "getNarrowestScopeFromExpression", "(Ljava/lang/String;)Lcom/sun/faces/el/ELUtils$Scope;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/BeanBuilder$Expression", "validateLifespanRuntime", "Z");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/mgbean/BeanBuilder$Expression", "validateLifespan", "(Lcom/sun/faces/el/ELUtils$Scope;Z)V", false);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"com/sun/faces/el/ELUtils$Scope"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/mgbean/BeanBuilder$Expression", "validateLifespanRuntime", "Z");
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/BeanBuilder$Expression", "expressionString", "Ljava/lang/String;");
methodVisitor.visitJumpInsn(IFNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("#{\"");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/BeanBuilder$Expression", "expressionString", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("[\\\\\"]");
methodVisitor.visitLdcInsn("\\\\$0");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "replaceAll", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("\"}");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/mgbean/BeanBuilder$Expression", "expressionString", "Ljava/lang/String;");
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "evaluate", "(Ljakarta/el/ELContext;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/BeanBuilder$Expression", "expressionString", "Ljava/lang/String;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/BeanBuilder$Expression", "validateLifespanRuntime", "Z");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/BeanBuilder$Expression", "expressionString", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/BeanBuilder$Expression", "segment", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/el/ELUtils", "getScope", "(Ljava/lang/String;[Ljava/lang/String;)Lcom/sun/faces/el/ELUtils$Scope;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/mgbean/BeanBuilder$Expression", "validateLifespan", "(Lcom/sun/faces/el/ELUtils$Scope;Z)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/BeanBuilder$Expression", "ve", "Ljakarta/el/ValueExpression;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/BeanBuilder$Expression", "expectedType", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isPrimitive", "()Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/BeanBuilder$Expression", "expressionString", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/BeanBuilder$Expression", "expectedType", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/el/ELUtils", "createValueExpression", "(Ljava/lang/String;Ljava/lang/Class;)Ljakarta/el/ValueExpression;", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"com/sun/faces/mgbean/BeanBuilder$Expression"});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/BeanBuilder$Expression", "expressionString", "Ljava/lang/String;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Object;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/el/ELUtils", "createValueExpression", "(Ljava/lang/String;Ljava/lang/Class;)Ljakarta/el/ValueExpression;", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"com/sun/faces/mgbean/BeanBuilder$Expression", "jakarta/el/ELContext"}, 2, new Object[] {"com/sun/faces/mgbean/BeanBuilder$Expression", "jakarta/el/ValueExpression"});
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/mgbean/BeanBuilder$Expression", "ve", "Ljakarta/el/ValueExpression;");
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/BeanBuilder$Expression", "expectedType", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isPrimitive", "()Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/BeanBuilder$Expression", "ve", "Ljakarta/el/ValueExpression;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/ValueExpression", "getValue", "(Ljakarta/el/ELContext;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/BeanBuilder$Expression", "ve", "Ljakarta/el/ValueExpression;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/ValueExpression", "getValue", "(Ljakarta/el/ELContext;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/BeanBuilder$Expression", "expectedType", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/el/ELUtils", "coerce", "(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Object"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "validateLifespan", "(Lcom/sun/faces/el/ELUtils$Scope;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/BeanBuilder$Expression", "this$0", "Lcom/sun/faces/mgbean/BeanBuilder;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/BeanBuilder", "beanInfo", "Lcom/sun/faces/mgbean/ManagedBeanInfo;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/mgbean/ManagedBeanInfo", "getScope", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/el/ELUtils", "isScopeValid", "(Ljava/lang/String;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/BeanBuilder$Expression", "this$0", "Lcom/sun/faces/mgbean/BeanBuilder;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/BeanBuilder", "beanInfo", "Lcom/sun/faces/mgbean/ManagedBeanInfo;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/mgbean/ManagedBeanInfo", "getScope", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/el/ELUtils", "getScope", "(Ljava/lang/String;)Lcom/sun/faces/el/ELUtils$Scope;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/el/ELUtils", "hasValidLifespan", "(Lcom/sun/faces/el/ELUtils$Scope;Lcom/sun/faces/el/ELUtils$Scope;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitLdcInsn("com.sun.faces.INVALID_SCOPE_LIFESPAN");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/BeanBuilder$Expression", "expressionString", "Ljava/lang/String;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/BeanBuilder$Expression", "this$0", "Lcom/sun/faces/mgbean/BeanBuilder;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/BeanBuilder", "beanInfo", "Lcom/sun/faces/mgbean/ManagedBeanInfo;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/mgbean/ManagedBeanInfo", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/BeanBuilder$Expression", "this$0", "Lcom/sun/faces/mgbean/BeanBuilder;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/BeanBuilder", "beanInfo", "Lcom/sun/faces/mgbean/ManagedBeanInfo;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/mgbean/ManagedBeanInfo", "getScope", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/util/MessageUtils", "getExceptionMessageString", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/mgbean/ManagedBeanCreationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/mgbean/ManagedBeanCreationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/BeanBuilder$Expression", "this$0", "Lcom/sun/faces/mgbean/BeanBuilder;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/mgbean/BeanBuilder", "queueMessage", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
