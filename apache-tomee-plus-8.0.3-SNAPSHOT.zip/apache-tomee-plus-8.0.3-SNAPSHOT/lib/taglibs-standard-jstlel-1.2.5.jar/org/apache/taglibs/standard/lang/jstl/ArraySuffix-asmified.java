package asm.org.apache.taglibs.standard.lang.jstl;
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
public class ArraySuffixDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/apache/taglibs/standard/lang/jstl/ArraySuffix", null, "org/apache/taglibs/standard/lang/jstl/ValueSuffix", null);

{
fieldVisitor = classWriter.visitField(ACC_STATIC, "sNoArgs", "[Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "mIndex", "Lorg/apache/taglibs/standard/lang/jstl/Expression;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getIndex", "()Lorg/apache/taglibs/standard/lang/jstl/Expression;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/lang/jstl/ArraySuffix", "mIndex", "Lorg/apache/taglibs/standard/lang/jstl/Expression;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setIndex", "(Lorg/apache/taglibs/standard/lang/jstl/Expression;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/lang/jstl/ArraySuffix", "mIndex", "Lorg/apache/taglibs/standard/lang/jstl/Expression;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/taglibs/standard/lang/jstl/Expression;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/taglibs/standard/lang/jstl/ValueSuffix", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/lang/jstl/ArraySuffix", "mIndex", "Lorg/apache/taglibs/standard/lang/jstl/Expression;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "evaluateIndex", "(Ljava/lang/Object;Lorg/apache/taglibs/standard/lang/jstl/VariableResolver;Ljava/util/Map;Ljava/lang/String;Lorg/apache/taglibs/standard/lang/jstl/Logger;)Ljava/lang/Object;", null, new String[] { "org/apache/taglibs/standard/lang/jstl/ELException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/lang/jstl/ArraySuffix", "mIndex", "Lorg/apache/taglibs/standard/lang/jstl/Expression;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/taglibs/standard/lang/jstl/Expression", "evaluate", "(Ljava/lang/Object;Lorg/apache/taglibs/standard/lang/jstl/VariableResolver;Ljava/util/Map;Ljava/lang/String;Lorg/apache/taglibs/standard/lang/jstl/Logger;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getOperatorSymbol", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("[]");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getExpressionString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("[");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/lang/jstl/ArraySuffix", "mIndex", "Lorg/apache/taglibs/standard/lang/jstl/Expression;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/taglibs/standard/lang/jstl/Expression", "getExpressionString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("]");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "evaluate", "(Ljava/lang/Object;Ljava/lang/Object;Lorg/apache/taglibs/standard/lang/jstl/VariableResolver;Ljava/util/Map;Ljava/lang/String;Lorg/apache/taglibs/standard/lang/jstl/Logger;)Ljava/lang/Object;", null, new String[] { "org/apache/taglibs/standard/lang/jstl/ELException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/ArrayIndexOutOfBoundsException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "java/lang/IndexOutOfBoundsException");
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label4, "java/lang/Exception");
Label label5 = new Label();
Label label6 = new Label();
Label label7 = new Label();
methodVisitor.visitTryCatchBlock(label5, label6, label7, "java/lang/ArrayIndexOutOfBoundsException");
Label label8 = new Label();
methodVisitor.visitTryCatchBlock(label5, label6, label8, "java/lang/IndexOutOfBoundsException");
Label label9 = new Label();
methodVisitor.visitTryCatchBlock(label5, label6, label9, "java/lang/Exception");
Label label10 = new Label();
Label label11 = new Label();
Label label12 = new Label();
methodVisitor.visitTryCatchBlock(label10, label11, label12, "java/lang/reflect/InvocationTargetException");
Label label13 = new Label();
methodVisitor.visitTryCatchBlock(label10, label11, label13, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 1);
Label label14 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label14);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/taglibs/standard/lang/jstl/Logger", "isLoggingWarning", "()Z", false);
Label label15 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label15);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/lang/jstl/Constants", "CANT_GET_INDEXED_VALUE_OF_NULL", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/taglibs/standard/lang/jstl/ArraySuffix", "getOperatorSymbol", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/taglibs/standard/lang/jstl/Logger", "logWarning", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label15);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label14);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/taglibs/standard/lang/jstl/ArraySuffix", "evaluateIndex", "(Ljava/lang/Object;Lorg/apache/taglibs/standard/lang/jstl/VariableResolver;Ljava/util/Map;Ljava/lang/String;Lorg/apache/taglibs/standard/lang/jstl/Logger;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 7);
Label label16 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label16);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/taglibs/standard/lang/jstl/Logger", "isLoggingWarning", "()Z", false);
Label label17 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label17);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/lang/jstl/Constants", "CANT_GET_NULL_INDEX", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/taglibs/standard/lang/jstl/ArraySuffix", "getOperatorSymbol", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/taglibs/standard/lang/jstl/Logger", "logWarning", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label17);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label16);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/util/Map");
Label label18 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label18);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map");
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label18);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/util/List");
Label label19 = new Label();
methodVisitor.visitJumpInsn(IFNE, label19);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isArray", "()Z", false);
Label label20 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label20);
methodVisitor.visitLabel(label19);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/taglibs/standard/lang/jstl/Coercions", "coerceToInteger", "(Ljava/lang/Object;Lorg/apache/taglibs/standard/lang/jstl/Logger;)Ljava/lang/Integer;", false);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 11);
Label label21 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label21);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/taglibs/standard/lang/jstl/Logger", "isLoggingError", "()Z", false);
Label label22 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label22);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/lang/jstl/Constants", "BAD_INDEX_VALUE", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/taglibs/standard/lang/jstl/ArraySuffix", "getOperatorSymbol", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/taglibs/standard/lang/jstl/Logger", "logError", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label22);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label21);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/util/List");
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/List");
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/taglibs/standard/lang/jstl/Logger", "isLoggingWarning", "()Z", false);
Label label23 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label23);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/lang/jstl/Constants", "EXCEPTION_ACCESSING_LIST", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/taglibs/standard/lang/jstl/Logger", "logWarning", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label23);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/taglibs/standard/lang/jstl/Logger", "isLoggingWarning", "()Z", false);
Label label24 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label24);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/lang/jstl/Constants", "EXCEPTION_ACCESSING_LIST", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/taglibs/standard/lang/jstl/Logger", "logWarning", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label24);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/taglibs/standard/lang/jstl/Logger", "isLoggingError", "()Z", false);
Label label25 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label25);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/lang/jstl/Constants", "EXCEPTION_ACCESSING_LIST", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/taglibs/standard/lang/jstl/Logger", "logError", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label25);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/reflect/Array", "get", "(Ljava/lang/Object;I)Ljava/lang/Object;", false);
methodVisitor.visitLabel(label6);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/taglibs/standard/lang/jstl/Logger", "isLoggingWarning", "()Z", false);
Label label26 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label26);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/lang/jstl/Constants", "EXCEPTION_ACCESSING_ARRAY", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/taglibs/standard/lang/jstl/Logger", "logWarning", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label26);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label8);
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/taglibs/standard/lang/jstl/Logger", "isLoggingWarning", "()Z", false);
Label label27 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label27);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/lang/jstl/Constants", "EXCEPTION_ACCESSING_ARRAY", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/taglibs/standard/lang/jstl/Logger", "logWarning", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label27);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label9);
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/taglibs/standard/lang/jstl/Logger", "isLoggingError", "()Z", false);
Label label28 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label28);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/lang/jstl/Constants", "EXCEPTION_ACCESSING_ARRAY", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/taglibs/standard/lang/jstl/Logger", "logError", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label28);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label20);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/taglibs/standard/lang/jstl/Coercions", "coerceToString", "(Ljava/lang/Object;Lorg/apache/taglibs/standard/lang/jstl/Logger;)Ljava/lang/String;", false);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 8);
Label label29 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label29);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label29);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/taglibs/standard/lang/jstl/BeanInfoManager", "getBeanInfoProperty", "(Ljava/lang/Class;Ljava/lang/String;Lorg/apache/taglibs/standard/lang/jstl/Logger;)Lorg/apache/taglibs/standard/lang/jstl/BeanInfoProperty;", false);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 9);
Label label30 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label30);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/taglibs/standard/lang/jstl/BeanInfoProperty", "getReadMethod", "()Ljava/lang/reflect/Method;", false);
methodVisitor.visitJumpInsn(IFNULL, label30);
methodVisitor.visitLabel(label10);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/taglibs/standard/lang/jstl/BeanInfoProperty", "getReadMethod", "()Ljava/lang/reflect/Method;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/lang/jstl/ArraySuffix", "sNoArgs", "[Ljava/lang/Object;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "invoke", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitLabel(label11);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label12);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/taglibs/standard/lang/jstl/Logger", "isLoggingError", "()Z", false);
Label label31 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label31);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/lang/jstl/Constants", "ERROR_GETTING_PROPERTY", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/InvocationTargetException", "getTargetException", "()Ljava/lang/Throwable;", false);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/taglibs/standard/lang/jstl/Logger", "logError", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label31);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label13);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/taglibs/standard/lang/jstl/Logger", "isLoggingError", "()Z", false);
Label label32 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label32);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/lang/jstl/Constants", "ERROR_GETTING_PROPERTY", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/taglibs/standard/lang/jstl/Logger", "logError", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label32);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label30);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/taglibs/standard/lang/jstl/Logger", "isLoggingError", "()Z", false);
Label label33 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label33);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/lang/jstl/Constants", "CANT_FIND_INDEX", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/taglibs/standard/lang/jstl/ArraySuffix", "getOperatorSymbol", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/taglibs/standard/lang/jstl/Logger", "logError", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label33);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 13);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/taglibs/standard/lang/jstl/ArraySuffix", "sNoArgs", "[Ljava/lang/Object;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
