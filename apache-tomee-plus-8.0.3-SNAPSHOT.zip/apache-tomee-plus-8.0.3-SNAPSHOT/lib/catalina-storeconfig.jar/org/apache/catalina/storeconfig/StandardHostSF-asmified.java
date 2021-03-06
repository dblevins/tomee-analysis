package asm.org.apache.catalina.storeconfig;
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
public class StandardHostSFDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/catalina/storeconfig/StandardHostSF", null, "org/apache/catalina/storeconfig/StoreFactoryBase", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/storeconfig/StoreFactoryBase", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "storeChildren", "(Ljava/io/PrintWriter;ILjava/lang/Object;Lorg/apache/catalina/storeconfig/StoreDescription;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/catalina/core/StandardHost");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/catalina/core/StandardHost");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/core/StandardHost", "findLifecycleListeners", "()[Lorg/apache/catalina/LifecycleListener;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/storeconfig/StandardHostSF", "storeElementArray", "(Ljava/io/PrintWriter;I[Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/core/StandardHost", "findAliases", "()[Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/storeconfig/StandardHostSF", "getStoreAppender", "()Lorg/apache/catalina/storeconfig/StoreAppender;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("Alias");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/storeconfig/StoreAppender", "printTagArray", "(Ljava/io/PrintWriter;Ljava/lang/String;I[Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/core/StandardHost", "getRealm", "()Lorg/apache/catalina/Realm;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/core/StandardHost", "getParent", "()Lorg/apache/catalina/Container;", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/core/StandardHost", "getParent", "()Lorg/apache/catalina/Container;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/Container", "getRealm", "()Lorg/apache/catalina/Realm;", true);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 10, new Object[] {"org/apache/catalina/storeconfig/StandardHostSF", "java/io/PrintWriter", Opcodes.INTEGER, "java/lang/Object", "org/apache/catalina/storeconfig/StoreDescription", "org/apache/catalina/core/StandardHost", "[Lorg/apache/catalina/LifecycleListener;", "[Ljava/lang/String;", "org/apache/catalina/Realm", "org/apache/catalina/Realm"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitJumpInsn(IF_ACMPEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/storeconfig/StandardHostSF", "storeElement", "(Ljava/io/PrintWriter;ILjava/lang/Object;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/core/StandardHost", "getPipeline", "()Lorg/apache/catalina/Pipeline;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/Pipeline", "getValves", "()[Lorg/apache/catalina/Valve;", true);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitJumpInsn(IFLE, label3);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 12);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 13);
Label label4 = new Label();
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 14, new Object[] {"org/apache/catalina/storeconfig/StandardHostSF", "java/io/PrintWriter", Opcodes.INTEGER, "java/lang/Object", "org/apache/catalina/storeconfig/StoreDescription", "org/apache/catalina/core/StandardHost", "[Lorg/apache/catalina/LifecycleListener;", "[Ljava/lang/String;", "org/apache/catalina/Realm", "[Lorg/apache/catalina/Valve;", "java/util/List", "[Lorg/apache/catalina/Valve;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 13);
methodVisitor.visitVarInsn(ILOAD, 12);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label5);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitVarInsn(ILOAD, 13);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 14);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/catalina/ha/ClusterValve");
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNE, label6);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(13, 1);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "toArray", "()[Ljava/lang/Object;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/storeconfig/StandardHostSF", "storeElementArray", "(Ljava/io/PrintWriter;I[Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/core/StandardHost", "getCluster", "()Lorg/apache/catalina/Cluster;", false);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 10);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label7);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/core/StandardHost", "getParent", "()Lorg/apache/catalina/Container;", false);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label8);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/core/StandardHost", "getParent", "()Lorg/apache/catalina/Container;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/Container", "getCluster", "()Lorg/apache/catalina/Cluster;", true);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/catalina/Cluster", "org/apache/catalina/Cluster"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitJumpInsn(IF_ACMPEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/storeconfig/StandardHostSF", "storeElement", "(Ljava/io/PrintWriter;ILjava/lang/Object;)V", false);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/core/StandardHost", "findChildren", "()[Lorg/apache/catalina/Container;", false);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/storeconfig/StandardHostSF", "storeElementArray", "(Ljava/io/PrintWriter;I[Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/catalina/storeconfig/StandardHostSF", "java/io/PrintWriter", Opcodes.INTEGER, "java/lang/Object", "org/apache/catalina/storeconfig/StoreDescription"}, 0, new Object[] {});
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 15);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
