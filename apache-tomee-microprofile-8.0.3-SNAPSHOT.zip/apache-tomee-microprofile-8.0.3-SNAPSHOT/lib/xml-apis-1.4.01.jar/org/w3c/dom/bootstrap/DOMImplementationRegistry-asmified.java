package asm.org.w3c.dom.bootstrap;
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
public class DOMImplementationRegistryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_1, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/w3c/dom/bootstrap/DOMImplementationRegistry", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/w3c/dom/bootstrap/DOMImplementationRegistry$1", null, null, 0);

classWriter.visitInnerClass("org/w3c/dom/bootstrap/DOMImplementationRegistry$2", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/w3c/dom/bootstrap/DOMImplementationRegistry$3", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/w3c/dom/bootstrap/DOMImplementationRegistry$4", null, null, ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PROPERTY", "Ljava/lang/String;", null, "org.w3c.dom.DOMImplementationSourceList");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "DEFAULT_LINE_LENGTH", "I", null, new Integer(80));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "DEFAULT_DOM_IMPLEMENTATION_SOURCE", "Ljava/lang/String;", null, "org.apache.xerces.dom.DOMXSImplementationSourceImpl");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "sources", "Ljava/util/Vector;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC | ACC_SYNTHETIC, "class$org$w3c$dom$bootstrap$DOMImplementationRegistry", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/util/Vector;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/w3c/dom/bootstrap/DOMImplementationRegistry", "sources", "Ljava/util/Vector;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "newInstance", "()Lorg/w3c/dom/bootstrap/DOMImplementationRegistry;", null, new String[] { "java/lang/ClassNotFoundException", "java/lang/InstantiationException", "java/lang/IllegalAccessException", "java/lang/ClassCastException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/Vector");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Vector", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/w3c/dom/bootstrap/DOMImplementationRegistry", "getClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLdcInsn("org.w3c.dom.DOMImplementationSourceList");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/w3c/dom/bootstrap/DOMImplementationRegistry", "getSystemProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/w3c/dom/bootstrap/DOMImplementationRegistry", "getServiceValue", "(Ljava/lang/ClassLoader;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitLdcInsn("org.apache.xerces.dom.DOMXSImplementationSourceImpl");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitTypeInsn(NEW, "java/util/StringTokenizer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/StringTokenizer", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
Label label5 = new Label();
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/StringTokenizer", "nextToken", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ClassLoader", "loadClass", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Class", "forName", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "newInstance", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/w3c/dom/DOMImplementationSource");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Vector", "addElement", "(Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/StringTokenizer", "hasMoreTokens", "()Z", false);
methodVisitor.visitJumpInsn(IFNE, label5);
methodVisitor.visitLabel(label3);
methodVisitor.visitTypeInsn(NEW, "org/w3c/dom/bootstrap/DOMImplementationRegistry");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/w3c/dom/bootstrap/DOMImplementationRegistry", "<init>", "(Ljava/util/Vector;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDOMImplementation", "(Ljava/lang/String;)Lorg/w3c/dom/DOMImplementation;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/w3c/dom/bootstrap/DOMImplementationRegistry", "sources", "Ljava/util/Vector;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Vector", "size", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(GOTO, label0);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/w3c/dom/bootstrap/DOMImplementationRegistry", "sources", "Ljava/util/Vector;");
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Vector", "elementAt", "(I)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/w3c/dom/DOMImplementationSource");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/DOMImplementationSource", "getDOMImplementation", "(Ljava/lang/String;)Lorg/w3c/dom/DOMImplementation;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitJumpInsn(IF_ICMPLT, label1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDOMImplementationList", "(Ljava/lang/String;)Lorg/w3c/dom/DOMImplementationList;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/Vector");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Vector", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/w3c/dom/bootstrap/DOMImplementationRegistry", "sources", "Ljava/util/Vector;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Vector", "size", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(GOTO, label0);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/w3c/dom/bootstrap/DOMImplementationRegistry", "sources", "Ljava/util/Vector;");
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Vector", "elementAt", "(I)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/w3c/dom/DOMImplementationSource");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/DOMImplementationSource", "getDOMImplementationList", "(Ljava/lang/String;)Lorg/w3c/dom/DOMImplementationList;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 7);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/DOMImplementationList", "item", "(I)Lorg/w3c/dom/DOMImplementation;", true);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Vector", "addElement", "(Ljava/lang/Object;)V", false);
methodVisitor.visitIincInsn(7, 1);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/DOMImplementationList", "getLength", "()I", true);
methodVisitor.visitJumpInsn(IF_ICMPLT, label3);
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitJumpInsn(IF_ICMPLT, label1);
methodVisitor.visitTypeInsn(NEW, "org/w3c/dom/bootstrap/DOMImplementationRegistry$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/w3c/dom/bootstrap/DOMImplementationRegistry$1", "<init>", "(Lorg/w3c/dom/bootstrap/DOMImplementationRegistry;Ljava/util/Vector;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addSource", "(Lorg/w3c/dom/DOMImplementationSource;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/NullPointerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/NullPointerException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/w3c/dom/bootstrap/DOMImplementationRegistry", "sources", "Ljava/util/Vector;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Vector", "contains", "(Ljava/lang/Object;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/w3c/dom/bootstrap/DOMImplementationRegistry", "sources", "Ljava/util/Vector;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Vector", "addElement", "(Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "getClassLoader", "()Ljava/lang/ClassLoader;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/w3c/dom/bootstrap/DOMImplementationRegistry", "getContextClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/w3c/dom/bootstrap/DOMImplementationRegistry", "class$org$w3c$dom$bootstrap$DOMImplementationRegistry", "Ljava/lang/Class;");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label4);
methodVisitor.visitLdcInsn("org.w3c.dom.bootstrap.DOMImplementationRegistry");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/w3c/dom/bootstrap/DOMImplementationRegistry", "class$", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/w3c/dom/bootstrap/DOMImplementationRegistry", "class$org$w3c$dom$bootstrap$DOMImplementationRegistry", "Ljava/lang/Class;");
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/w3c/dom/bootstrap/DOMImplementationRegistry", "class$org$w3c$dom$bootstrap$DOMImplementationRegistry", "Ljava/lang/Class;");
methodVisitor.visitLabel(label5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/w3c/dom/bootstrap/DOMImplementationRegistry", "class$org$w3c$dom$bootstrap$DOMImplementationRegistry", "Ljava/lang/Class;");
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label6);
methodVisitor.visitLdcInsn("org.w3c.dom.bootstrap.DOMImplementationRegistry");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/w3c/dom/bootstrap/DOMImplementationRegistry", "class$", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/w3c/dom/bootstrap/DOMImplementationRegistry", "class$org$w3c$dom$bootstrap$DOMImplementationRegistry", "Ljava/lang/Class;");
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/w3c/dom/bootstrap/DOMImplementationRegistry", "class$org$w3c$dom$bootstrap$DOMImplementationRegistry", "Ljava/lang/Class;");
methodVisitor.visitLabel(label7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "getServiceValue", "(Ljava/lang/ClassLoader;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/UnsupportedEncodingException");
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label4, null);
Label label5 = new Label();
Label label6 = new Label();
Label label7 = new Label();
methodVisitor.visitTryCatchBlock(label5, label6, label7, "java/lang/Exception");
methodVisitor.visitLdcInsn("META-INF/services/org.w3c.dom.DOMImplementationSourceList");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/w3c/dom/bootstrap/DOMImplementationRegistry", "getResourceAsStream", "(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/io/InputStream;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "java/io/BufferedReader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/io/InputStreamReader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("UTF-8");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/InputStreamReader", "<init>", "(Ljava/io/InputStream;Ljava/lang/String;)V", false);
methodVisitor.visitIntInsn(BIPUSH, 80);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/BufferedReader", "<init>", "(Ljava/io/Reader;I)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label1);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "java/io/BufferedReader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/io/InputStreamReader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/InputStreamReader", "<init>", "(Ljava/io/InputStream;)V", false);
methodVisitor.visitIntInsn(BIPUSH, 80);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/BufferedReader", "<init>", "(Ljava/io/Reader;I)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label8);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/BufferedReader", "readLine", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label9 = new Label();
methodVisitor.visitJumpInsn(JSR, label9);
Label label10 = new Label();
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitJumpInsn(JSR, label9);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label9);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/BufferedReader", "close", "()V", false);
methodVisitor.visitVarInsn(RET, 6);
methodVisitor.visitLabel(label10);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
methodVisitor.visitJumpInsn(IFLE, label6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label6);
Label label11 = new Label();
methodVisitor.visitJumpInsn(GOTO, label11);
methodVisitor.visitLabel(label7);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label11);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "isJRE11", "()Z", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label1, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitLdcInsn("java.security.AccessController");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Class", "forName", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "getContextClassLoader", "()Ljava/lang/ClassLoader;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/w3c/dom/bootstrap/DOMImplementationRegistry", "isJRE11", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ACONST_NULL);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/w3c/dom/bootstrap/DOMImplementationRegistry$2");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/w3c/dom/bootstrap/DOMImplementationRegistry$2", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AccessController", "doPrivileged", "(Ljava/security/PrivilegedAction;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/ClassLoader");
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "getSystemProperty", "(Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/w3c/dom/bootstrap/DOMImplementationRegistry", "isJRE11", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "getProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/w3c/dom/bootstrap/DOMImplementationRegistry$3");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/w3c/dom/bootstrap/DOMImplementationRegistry$3", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AccessController", "doPrivileged", "(Ljava/security/PrivilegedAction;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "getResourceAsStream", "(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/io/InputStream;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/w3c/dom/bootstrap/DOMImplementationRegistry", "isJRE11", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/ClassLoader", "getSystemResourceAsStream", "(Ljava/lang/String;)Ljava/io/InputStream;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ClassLoader", "getResourceAsStream", "(Ljava/lang/String;)Ljava/io/InputStream;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/w3c/dom/bootstrap/DOMImplementationRegistry$4");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/w3c/dom/bootstrap/DOMImplementationRegistry$4", "<init>", "(Ljava/lang/ClassLoader;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AccessController", "doPrivileged", "(Ljava/security/PrivilegedAction;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/io/InputStream");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "class$", "(Ljava/lang/String;)Ljava/lang/Class;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label1, "java/lang/ClassNotFoundException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Class", "forName", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "java/lang/NoClassDefFoundError");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Throwable", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/NoClassDefFoundError", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
