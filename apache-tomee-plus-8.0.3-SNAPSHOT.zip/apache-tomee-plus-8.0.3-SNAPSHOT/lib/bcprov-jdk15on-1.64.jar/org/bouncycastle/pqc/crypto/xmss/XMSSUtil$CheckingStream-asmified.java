package asm.org.bouncycastle.pqc.crypto.xmss;
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
public class XMSSUtil$CheckingStreamDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_SUPER, "org/bouncycastle/pqc/crypto/xmss/XMSSUtil$CheckingStream", null, "java/io/ObjectInputStream", null);

classWriter.visitInnerClass("org/bouncycastle/pqc/crypto/xmss/XMSSUtil$CheckingStream", "org/bouncycastle/pqc/crypto/xmss/XMSSUtil", "CheckingStream", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "components", "Ljava/util/Set;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "mainClass", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "found", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Ljava/lang/Class;Ljava/io/InputStream;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/ObjectInputStream", "<init>", "(Ljava/io/InputStream;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/crypto/xmss/XMSSUtil$CheckingStream", "found", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/crypto/xmss/XMSSUtil$CheckingStream", "mainClass", "Ljava/lang/Class;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "resolveClass", "(Ljava/io/ObjectStreamClass;)Ljava/lang/Class;", "(Ljava/io/ObjectStreamClass;)Ljava/lang/Class<*>;", new String[] { "java/io/IOException", "java/lang/ClassNotFoundException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/xmss/XMSSUtil$CheckingStream", "found", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ObjectStreamClass", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/xmss/XMSSUtil$CheckingStream", "mainClass", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitTypeInsn(NEW, "java/io/InvalidClassException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("unexpected class: ");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ObjectStreamClass", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/InvalidClassException", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/crypto/xmss/XMSSUtil$CheckingStream", "found", "Z");
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/pqc/crypto/xmss/XMSSUtil$CheckingStream", "components", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ObjectStreamClass", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "contains", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitTypeInsn(NEW, "java/io/InvalidClassException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("unexpected class: ");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ObjectStreamClass", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/InvalidClassException", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/ObjectInputStream", "resolveClass", "(Ljava/io/ObjectStreamClass;)Ljava/lang/Class;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/HashSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashSet", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/pqc/crypto/xmss/XMSSUtil$CheckingStream", "components", "Ljava/util/Set;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/pqc/crypto/xmss/XMSSUtil$CheckingStream", "components", "Ljava/util/Set;");
methodVisitor.visitLdcInsn("java.util.TreeMap");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/pqc/crypto/xmss/XMSSUtil$CheckingStream", "components", "Ljava/util/Set;");
methodVisitor.visitLdcInsn("java.lang.Integer");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/pqc/crypto/xmss/XMSSUtil$CheckingStream", "components", "Ljava/util/Set;");
methodVisitor.visitLdcInsn("java.lang.Number");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/pqc/crypto/xmss/XMSSUtil$CheckingStream", "components", "Ljava/util/Set;");
methodVisitor.visitLdcInsn("org.bouncycastle.pqc.crypto.xmss.BDS");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/pqc/crypto/xmss/XMSSUtil$CheckingStream", "components", "Ljava/util/Set;");
methodVisitor.visitLdcInsn("java.util.ArrayList");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/pqc/crypto/xmss/XMSSUtil$CheckingStream", "components", "Ljava/util/Set;");
methodVisitor.visitLdcInsn("org.bouncycastle.pqc.crypto.xmss.XMSSNode");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/pqc/crypto/xmss/XMSSUtil$CheckingStream", "components", "Ljava/util/Set;");
methodVisitor.visitLdcInsn("[B");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/pqc/crypto/xmss/XMSSUtil$CheckingStream", "components", "Ljava/util/Set;");
methodVisitor.visitLdcInsn("java.util.LinkedList");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/pqc/crypto/xmss/XMSSUtil$CheckingStream", "components", "Ljava/util/Set;");
methodVisitor.visitLdcInsn("java.util.Stack");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/pqc/crypto/xmss/XMSSUtil$CheckingStream", "components", "Ljava/util/Set;");
methodVisitor.visitLdcInsn("java.util.Vector");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/pqc/crypto/xmss/XMSSUtil$CheckingStream", "components", "Ljava/util/Set;");
methodVisitor.visitLdcInsn("[Ljava.lang.Object;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/pqc/crypto/xmss/XMSSUtil$CheckingStream", "components", "Ljava/util/Set;");
methodVisitor.visitLdcInsn("org.bouncycastle.pqc.crypto.xmss.BDSTreeHash");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
