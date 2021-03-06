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
public class ManagedBeanBuilder$BakedListPropertyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "com/sun/faces/mgbean/ManagedBeanBuilder$BakedListProperty", null, "java/lang/Object", new String[] { "com/sun/faces/mgbean/ManagedBeanBuilder$BakedProperty" });

classWriter.visitInnerClass("com/sun/faces/mgbean/BeanBuilder$Expression", "com/sun/faces/mgbean/BeanBuilder", "Expression", ACC_PROTECTED);

classWriter.visitInnerClass("com/sun/faces/mgbean/ManagedBeanBuilder$BakedListProperty", "com/sun/faces/mgbean/ManagedBeanBuilder", "BakedListProperty", ACC_PRIVATE);

classWriter.visitInnerClass("com/sun/faces/mgbean/ManagedBeanBuilder$BakedProperty", "com/sun/faces/mgbean/ManagedBeanBuilder", "BakedProperty", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "listEntries", "Ljava/util/List;", "Ljava/util/List<Lcom/sun/faces/mgbean/BeanBuilder$Expression;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "pd", "Ljava/beans/PropertyDescriptor;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lcom/sun/faces/mgbean/ManagedBeanBuilder;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lcom/sun/faces/mgbean/ManagedBeanBuilder;Ljava/util/List;Ljava/beans/PropertyDescriptor;)V", "(Ljava/util/List<Lcom/sun/faces/mgbean/BeanBuilder$Expression;>;Ljava/beans/PropertyDescriptor;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/mgbean/ManagedBeanBuilder$BakedListProperty", "this$0", "Lcom/sun/faces/mgbean/ManagedBeanBuilder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/mgbean/ManagedBeanBuilder$BakedListProperty", "listEntries", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/mgbean/ManagedBeanBuilder$BakedListProperty", "pd", "Ljava/beans/PropertyDescriptor;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "set", "(Ljava/lang/Object;Ljakarta/faces/context/FacesContext;)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/IllegalAccessException");
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/IllegalArgumentException");
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/reflect/InvocationTargetException");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/lang/IllegalAccessException");
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/lang/IllegalArgumentException");
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/lang/reflect/InvocationTargetException");
Label label6 = new Label();
Label label7 = new Label();
Label label8 = new Label();
methodVisitor.visitTryCatchBlock(label6, label7, label8, "java/lang/IllegalAccessException");
methodVisitor.visitTryCatchBlock(label6, label7, label8, "java/lang/IllegalArgumentException");
methodVisitor.visitTryCatchBlock(label6, label7, label8, "java/lang/reflect/InvocationTargetException");
Label label9 = new Label();
Label label10 = new Label();
Label label11 = new Label();
methodVisitor.visitTryCatchBlock(label9, label10, label11, "java/lang/IllegalAccessException");
methodVisitor.visitTryCatchBlock(label9, label10, label11, "java/lang/IllegalArgumentException");
methodVisitor.visitTryCatchBlock(label9, label10, label11, "java/lang/reflect/InvocationTargetException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/ManagedBeanBuilder$BakedListProperty", "pd", "Ljava/beans/PropertyDescriptor;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/beans/PropertyDescriptor", "getReadMethod", "()Ljava/lang/reflect/Method;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label12 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label12);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/RIConstants", "EMPTY_METH_ARGS", "[Ljava/lang/Object;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "invoke", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"com/sun/faces/mgbean/ManagedBeanBuilder$BakedListProperty", "java/lang/Object", "jakarta/faces/context/FacesContext", "java/lang/reflect/Method", "java/lang/Object"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label13 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label13);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isArray", "()Z", false);
Label label14 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label14);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/reflect/Array", "getLength", "(Ljava/lang/Object;)I", false);
methodVisitor.visitVarInsn(ISTORE, 7);
Label label15 = new Label();
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"java/util/List", Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 7);
Label label16 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label16);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label17 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label17);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label17);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/reflect/Array", "get", "(Ljava/lang/Object;I)Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitIincInsn(6, 1);
methodVisitor.visitJumpInsn(GOTO, label15);
methodVisitor.visitLabel(label16);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label13);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/List");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label18 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label18);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label18);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/context/FacesContext", "getApplication", "()Ljakarta/faces/application/Application;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/application/Application", "getExpressionFactory", "()Ljakarta/el/ExpressionFactory;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/ManagedBeanBuilder$BakedListProperty", "this$0", "Lcom/sun/faces/mgbean/ManagedBeanBuilder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/ManagedBeanBuilder$BakedListProperty", "listEntries", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/mgbean/ManagedBeanBuilder", "initList", "(Ljava/util/List;Ljava/util/List;Ljakarta/faces/context/FacesContext;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label19 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label19);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isArray", "()Z", false);
methodVisitor.visitJumpInsn(IFNE, label19);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label19);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"jakarta/el/ExpressionFactory"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label20 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label20);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getComponentType", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "size", "()I", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/reflect/Array", "newInstance", "(Ljava/lang/Class;I)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "size", "()I", true);
methodVisitor.visitVarInsn(ISTORE, 10);
Label label21 = new Label();
methodVisitor.visitLabel(label21);
methodVisitor.visitFrame(Opcodes.F_FULL, 11, new Object[] {"com/sun/faces/mgbean/ManagedBeanBuilder$BakedListProperty", "java/lang/Object", "jakarta/faces/context/FacesContext", "java/lang/reflect/Method", "java/lang/Object", "java/util/List", "jakarta/el/ExpressionFactory", "java/lang/Class", "java/lang/Object", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitVarInsn(ILOAD, 10);
methodVisitor.visitJumpInsn(IF_ICMPGE, label3);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/ExpressionFactory", "coerceToType", "(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/reflect/Array", "set", "(Ljava/lang/Object;ILjava/lang/Object;)V", false);
methodVisitor.visitIincInsn(9, 1);
methodVisitor.visitJumpInsn(GOTO, label21);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/ManagedBeanBuilder$BakedListProperty", "pd", "Ljava/beans/PropertyDescriptor;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/beans/PropertyDescriptor", "getWriteMethod", "()Ljava/lang/reflect/Method;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "invoke", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label4);
Label label22 = new Label();
methodVisitor.visitJumpInsn(GOTO, label22);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitLdcInsn("com.sun.faces.MANAGED_BEAN_UNABLE_TO_SET_PROPERTY_ERROR");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/ManagedBeanBuilder$BakedListProperty", "pd", "Ljava/beans/PropertyDescriptor;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/beans/PropertyDescriptor", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/ManagedBeanBuilder$BakedListProperty", "this$0", "Lcom/sun/faces/mgbean/ManagedBeanBuilder;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/ManagedBeanBuilder", "beanInfo", "Lcom/sun/faces/mgbean/ManagedBeanInfo;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/mgbean/ManagedBeanInfo", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/util/MessageUtils", "getExceptionMessageString", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/mgbean/ManagedBeanCreationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/mgbean/ManagedBeanCreationException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label22);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
Label label23 = new Label();
methodVisitor.visitJumpInsn(GOTO, label23);
methodVisitor.visitLabel(label20);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/ManagedBeanBuilder$BakedListProperty", "pd", "Ljava/beans/PropertyDescriptor;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/beans/PropertyDescriptor", "getWriteMethod", "()Ljava/lang/reflect/Method;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "getParameterTypes", "()[Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isArray", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getComponentType", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "size", "()I", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/reflect/Array", "newInstance", "(Ljava/lang/Class;I)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "size", "()I", true);
methodVisitor.visitVarInsn(ISTORE, 12);
Label label24 = new Label();
methodVisitor.visitLabel(label24);
methodVisitor.visitFrame(Opcodes.F_FULL, 13, new Object[] {"com/sun/faces/mgbean/ManagedBeanBuilder$BakedListProperty", "java/lang/Object", "jakarta/faces/context/FacesContext", "java/lang/reflect/Method", "java/lang/Object", "java/util/List", "jakarta/el/ExpressionFactory", "java/lang/reflect/Method", "[Ljava/lang/Class;", "java/lang/Class", "java/lang/Object", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitVarInsn(ILOAD, 12);
methodVisitor.visitJumpInsn(IF_ICMPGE, label6);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/ExpressionFactory", "coerceToType", "(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/reflect/Array", "set", "(Ljava/lang/Object;ILjava/lang/Object;)V", false);
methodVisitor.visitIincInsn(11, 1);
methodVisitor.visitJumpInsn(GOTO, label24);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "invoke", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label7);
Label label25 = new Label();
methodVisitor.visitJumpInsn(GOTO, label25);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitLdcInsn("com.sun.faces.MANAGED_BEAN_UNABLE_TO_SET_PROPERTY_ERROR");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/ManagedBeanBuilder$BakedListProperty", "pd", "Ljava/beans/PropertyDescriptor;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/beans/PropertyDescriptor", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/ManagedBeanBuilder$BakedListProperty", "this$0", "Lcom/sun/faces/mgbean/ManagedBeanBuilder;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/ManagedBeanBuilder", "beanInfo", "Lcom/sun/faces/mgbean/ManagedBeanInfo;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/mgbean/ManagedBeanInfo", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/util/MessageUtils", "getExceptionMessageString", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/mgbean/ManagedBeanCreationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/mgbean/ManagedBeanCreationException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label25);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label23);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "invoke", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label10);
methodVisitor.visitJumpInsn(GOTO, label23);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitLdcInsn("com.sun.faces.MANAGED_BEAN_UNABLE_TO_SET_PROPERTY_ERROR");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/ManagedBeanBuilder$BakedListProperty", "pd", "Ljava/beans/PropertyDescriptor;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/beans/PropertyDescriptor", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/ManagedBeanBuilder$BakedListProperty", "this$0", "Lcom/sun/faces/mgbean/ManagedBeanBuilder;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/ManagedBeanBuilder", "beanInfo", "Lcom/sun/faces/mgbean/ManagedBeanInfo;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/mgbean/ManagedBeanInfo", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/util/MessageUtils", "getExceptionMessageString", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/mgbean/ManagedBeanCreationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/mgbean/ManagedBeanCreationException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label23);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 13);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
