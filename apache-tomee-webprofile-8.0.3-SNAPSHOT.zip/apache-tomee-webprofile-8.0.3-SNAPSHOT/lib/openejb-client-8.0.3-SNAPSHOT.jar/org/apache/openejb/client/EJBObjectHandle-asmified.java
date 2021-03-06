package asm.org.apache.openejb.client;
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
public class EJBObjectHandleDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/client/EJBObjectHandle", null, "java/lang/Object", new String[] { "java/io/Externalizable", "jakarta/ejb/Handle" });

classWriter.visitInnerClass("org/apache/openejb/client/JNDIContext$AuthenticationInfo", "org/apache/openejb/client/JNDIContext", "AuthenticationInfo", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(-4428541526493118024L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_TRANSIENT, "ejbObjectProxy", "Lorg/apache/openejb/client/EJBObjectProxy;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_TRANSIENT, "handler", "Lorg/apache/openejb/client/EJBObjectHandler;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "metaData", "Lorg/apache/openejb/client/ProtocolMetaData;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openejb/client/EJBObjectProxy;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/client/EJBObjectHandle", "ejbObjectProxy", "Lorg/apache/openejb/client/EJBObjectProxy;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/client/EJBObjectHandle", "ejbObjectProxy", "Lorg/apache/openejb/client/EJBObjectProxy;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/client/EJBObjectProxy", "getEJBObjectHandler", "()Lorg/apache/openejb/client/EJBObjectHandler;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/client/EJBObjectHandle", "handler", "Lorg/apache/openejb/client/EJBObjectHandler;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMetaData", "(Lorg/apache/openejb/client/ProtocolMetaData;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/client/EJBObjectHandle", "metaData", "Lorg/apache/openejb/client/ProtocolMetaData;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "setEJBObjectProxy", "(Lorg/apache/openejb/client/EJBObjectProxy;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/client/EJBObjectHandle", "ejbObjectProxy", "Lorg/apache/openejb/client/EJBObjectProxy;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/client/EJBObjectProxy", "getEJBObjectHandler", "()Lorg/apache/openejb/client/EJBObjectHandler;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/client/EJBObjectHandle", "handler", "Lorg/apache/openejb/client/EJBObjectHandler;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEJBObject", "()Ljakarta/ejb/EJBObject;", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/client/EJBObjectHandle", "ejbObjectProxy", "Lorg/apache/openejb/client/EJBObjectProxy;");
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/ejb/EJBObject");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeExternal", "(Ljava/io/ObjectOutput;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/ObjectOutput", "writeByte", "(I)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/client/EJBObjectHandle", "handler", "Lorg/apache/openejb/client/EJBObjectHandler;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/client/EJBObjectHandler", "executor", "Ljava/util/concurrent/ThreadPoolExecutor;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/client/EJBObjectHandle", "handler", "Lorg/apache/openejb/client/EJBObjectHandler;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/client/EJBObjectHandler", "executor", "Ljava/util/concurrent/ThreadPoolExecutor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/client/JNDIContext", "globalExecutor", "()Ljava/util/concurrent/ThreadPoolExecutor;", false);
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/ObjectOutput", "writeBoolean", "(Z)V", true);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/client/EJBObjectHandle", "handler", "Lorg/apache/openejb/client/EJBObjectHandler;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/client/EJBObjectHandler", "executor", "Ljava/util/concurrent/ThreadPoolExecutor;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/ThreadPoolExecutor", "getMaximumPoolSize", "()I", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/ObjectOutput", "writeInt", "(I)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/client/EJBObjectHandle", "handler", "Lorg/apache/openejb/client/EJBObjectHandler;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/client/EJBObjectHandler", "executor", "Ljava/util/concurrent/ThreadPoolExecutor;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/ThreadPoolExecutor", "getQueue", "()Ljava/util/concurrent/BlockingQueue;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/BlockingQueue", "size", "()I", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/BlockingQueue", "remainingCapacity", "()I", true);
methodVisitor.visitInsn(IADD);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/ObjectOutput", "writeInt", "(I)V", true);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/client/EJBObjectHandle", "handler", "Lorg/apache/openejb/client/EJBObjectHandler;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/client/EJBObjectHandler", "client", "Lorg/apache/openejb/client/ClientMetaData;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/client/EJBObjectHandle", "metaData", "Lorg/apache/openejb/client/ProtocolMetaData;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/ClientMetaData", "setMetaData", "(Lorg/apache/openejb/client/ProtocolMetaData;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/client/EJBObjectHandle", "handler", "Lorg/apache/openejb/client/EJBObjectHandler;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/client/EJBObjectHandler", "client", "Lorg/apache/openejb/client/ClientMetaData;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/ClientMetaData", "writeExternal", "(Ljava/io/ObjectOutput;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/client/EJBObjectHandle", "handler", "Lorg/apache/openejb/client/EJBObjectHandler;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/client/EJBObjectHandler", "ejb", "Lorg/apache/openejb/client/EJBMetaDataImpl;");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/client/EJBMetaDataImpl", "homeClass", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/client/EJBObjectHandle", "getClassName", "(Ljava/lang/Class;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/ObjectOutput", "writeObject", "(Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/client/EJBMetaDataImpl", "remoteClass", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/client/EJBObjectHandle", "getClassName", "(Ljava/lang/Class;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/ObjectOutput", "writeObject", "(Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/client/EJBMetaDataImpl", "keyClass", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/client/EJBObjectHandle", "getClassName", "(Ljava/lang/Class;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/ObjectOutput", "writeObject", "(Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/client/EJBMetaDataImpl", "type", "B");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/ObjectOutput", "writeByte", "(I)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/client/EJBMetaDataImpl", "deploymentID", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/ObjectOutput", "writeUTF", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/client/EJBMetaDataImpl", "deploymentCode", "I");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/ObjectOutput", "writeShort", "(I)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/client/EJBObjectHandle", "handler", "Lorg/apache/openejb/client/EJBObjectHandler;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/client/EJBObjectHandler", "server", "Lorg/apache/openejb/client/ServerMetaData;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/client/EJBObjectHandle", "metaData", "Lorg/apache/openejb/client/ProtocolMetaData;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/ServerMetaData", "setMetaData", "(Lorg/apache/openejb/client/ProtocolMetaData;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/client/EJBObjectHandle", "handler", "Lorg/apache/openejb/client/EJBObjectHandler;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/client/EJBObjectHandler", "server", "Lorg/apache/openejb/client/ServerMetaData;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/ServerMetaData", "writeExternal", "(Ljava/io/ObjectOutput;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/client/EJBObjectHandle", "handler", "Lorg/apache/openejb/client/EJBObjectHandler;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/client/EJBObjectHandler", "primaryKey", "Ljava/lang/Object;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/ObjectOutput", "writeObject", "(Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "readExternal", "(Ljava/io/ObjectInput;)V", null, new String[] { "java/io/IOException", "java/lang/ClassNotFoundException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/ObjectInput", "readByte", "()B", true);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/ObjectInput", "readBoolean", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/ObjectInput", "readInt", "()I", true);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/LinkedBlockingQueue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(ICONST_2);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label3);
methodVisitor.visitInsn(ICONST_2);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/openejb/client/EJBObjectHandle", "java/io/ObjectInput", Opcodes.INTEGER, Opcodes.TOP, Opcodes.INTEGER}, 2, new Object[] {label2, label2});
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/openejb/client/EJBObjectHandle", "java/io/ObjectInput", Opcodes.INTEGER, Opcodes.TOP, Opcodes.INTEGER}, 3, new Object[] {label2, label2, Opcodes.INTEGER});
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/LinkedBlockingQueue", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/ObjectInput", "readInt", "()I", true);
methodVisitor.visitVarInsn(ISTORE, 6);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/client/JNDIContext", "newExecutor", "(ILjava/util/concurrent/BlockingQueue;)Ljava/util/concurrent/ThreadPoolExecutor;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/client/JNDIContext", "globalExecutor", "()Ljava/util/concurrent/ThreadPoolExecutor;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/concurrent/ThreadPoolExecutor"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/client/ClientMetaData");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/ClientMetaData", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/client/EJBMetaDataImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/EJBMetaDataImpl", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/client/ServerMetaData");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/ServerMetaData", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/client/EJBObjectHandle", "metaData", "Lorg/apache/openejb/client/ProtocolMetaData;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/ClientMetaData", "setMetaData", "(Lorg/apache/openejb/client/ProtocolMetaData;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/ClientMetaData", "readExternal", "(Ljava/io/ObjectInput;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Thread", "currentThread", "()Ljava/lang/Thread;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "getContextClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/apache/openejb/client/EJBObjectHandle", "java/io/ObjectInput", Opcodes.INTEGER, "java/util/concurrent/ThreadPoolExecutor", "org/apache/openejb/client/ClientMetaData", "org/apache/openejb/client/EJBMetaDataImpl", "org/apache/openejb/client/ServerMetaData", "java/lang/ClassLoader"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/ObjectInput", "readObject", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/client/EJBObjectHandle", "loadClass", "(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/client/EJBMetaDataImpl", "homeClass", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/ObjectInput", "readObject", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/client/EJBObjectHandle", "loadClass", "(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/client/EJBMetaDataImpl", "remoteClass", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/ObjectInput", "readObject", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/client/EJBObjectHandle", "loadClass", "(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/client/EJBMetaDataImpl", "keyClass", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/ObjectInput", "readByte", "()B", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/client/EJBMetaDataImpl", "type", "B");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/ObjectInput", "readUTF", "()Ljava/lang/String;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/client/EJBMetaDataImpl", "deploymentID", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/ObjectInput", "readShort", "()S", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/client/EJBMetaDataImpl", "deploymentCode", "I");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/client/EJBObjectHandle", "metaData", "Lorg/apache/openejb/client/ProtocolMetaData;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/ServerMetaData", "setMetaData", "(Lorg/apache/openejb/client/ProtocolMetaData;)V", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/ServerMetaData", "readExternal", "(Ljava/io/ObjectInput;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/ObjectInput", "readObject", "()Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/client/EJBObjectHandler", "createEJBObjectHandler", "(Ljava/util/concurrent/ThreadPoolExecutor;Lorg/apache/openejb/client/EJBMetaDataImpl;Lorg/apache/openejb/client/ServerMetaData;Lorg/apache/openejb/client/ClientMetaData;Ljava/lang/Object;Lorg/apache/openejb/client/JNDIContext$AuthenticationInfo;)Lorg/apache/openejb/client/EJBObjectHandler;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/client/EJBObjectHandle", "handler", "Lorg/apache/openejb/client/EJBObjectHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/client/EJBObjectHandle", "handler", "Lorg/apache/openejb/client/EJBObjectHandler;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/EJBObjectHandler", "createEJBObjectProxy", "()Lorg/apache/openejb/client/EJBObjectProxy;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/client/EJBObjectHandle", "ejbObjectProxy", "Lorg/apache/openejb/client/EJBObjectProxy;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "getClassName", "(Ljava/lang/Class;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/String"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "loadClass", "(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;", null, new String[] { "java/lang/ClassNotFoundException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Class", "forName", "(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Class"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
