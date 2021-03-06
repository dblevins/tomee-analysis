package asm.org.apache.cxf.jaxws.interceptors;
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
public class HolderInInterceptorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/jaxws/interceptors/HolderInInterceptor", "Lorg/apache/cxf/phase/AbstractPhaseInterceptor<Lorg/apache/cxf/message/Message;>;", "org/apache/cxf/phase/AbstractPhaseInterceptor", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CLIENT_HOLDERS", "Ljava/lang/String;", null, "client.holders");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("pre-invoke");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/phase/AbstractPhaseInterceptor", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "handleMessage", "(Lorg/apache/cxf/message/Message;)V", null, new String[] { "org/apache/cxf/interceptor/Fault" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/message/MessageContentsList", "getContentsList", "(Lorg/apache/cxf/message/Message;)Lorg/apache/cxf/message/MessageContentsList;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Message", "getExchange", "()Lorg/apache/cxf/message/Exchange;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Exchange", "getBindingOperationInfo", "()Lorg/apache/cxf/service/model/BindingOperationInfo;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"org/apache/cxf/message/MessageContentsList", "org/apache/cxf/message/Exchange", "org/apache/cxf/service/model/BindingOperationInfo"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/BindingOperationInfo", "getOperationInfo", "()Lorg/apache/cxf/service/model/OperationInfo;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/OperationInfo", "hasOutput", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/OperationInfo", "getOutput", "()Lorg/apache/cxf/service/model/MessageInfo;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/MessageInfo", "size", "()I", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/cxf/service/model/OperationInfo"}, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/OperationInfo", "getOutput", "()Lorg/apache/cxf/service/model/MessageInfo;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/MessageInfo", "getMessageParts", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("org.apache.cxf.client");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Message", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitVarInsn(ILOAD, 7);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Message", "getExchange", "()Lorg/apache/cxf/message/Exchange;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Exchange", "getOutMessage", "()Lorg/apache/cxf/message/Message;", true);
methodVisitor.visitLdcInsn("client.holders");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Message", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/List");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/helpers/CastUtils", "cast", "(Ljava/util/List;)Ljava/util/List;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 9);
Label label4 = new Label();
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 10, new Object[] {"org/apache/cxf/jaxws/interceptors/HolderInInterceptor", "org/apache/cxf/message/Message", "org/apache/cxf/message/MessageContentsList", "org/apache/cxf/message/Exchange", "org/apache/cxf/service/model/BindingOperationInfo", "org/apache/cxf/service/model/OperationInfo", "java/util/List", Opcodes.INTEGER, "java/util/List", "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/service/model/MessagePartInfo");
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/MessagePartInfo", "getIndex", "()I", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/MessagePartInfo", "getTypeClass", "()Ljava/lang/Class;", false);
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/MessagePartInfo", "getIndex", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/xml/ws/Holder");
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/message/MessageContentsList", "get", "(Lorg/apache/cxf/service/model/MessagePartInfo;)Ljava/lang/Object;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/xml/ws/Holder", "value", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/message/MessageContentsList", "put", "(Lorg/apache/cxf/service/model/MessagePartInfo;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 8);
Label label8 = new Label();
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/service/model/MessagePartInfo");
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/MessagePartInfo", "getIndex", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ISTORE, 10);
methodVisitor.visitVarInsn(ILOAD, 10);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFLT, label9);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/MessagePartInfo", "getTypeClass", "()Ljava/lang/Class;", false);
methodVisitor.visitJumpInsn(IFNULL, label9);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label10);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/message/MessageContentsList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/message/MessageContentsList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/List;"));
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Message", "setContent", "(Ljava/lang/Class;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/cxf/service/model/MessagePartInfo", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/message/MessageContentsList", "size", "()I", false);
Label label11 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLT, label11);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 10);
methodVisitor.visitTypeInsn(NEW, "jakarta/xml/ws/Holder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/xml/ws/Holder", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/message/MessageContentsList", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/message/MessageContentsList", "get", "(I)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 10);
methodVisitor.visitTypeInsn(NEW, "jakarta/xml/ws/Holder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/xml/ws/Holder", "<init>", "(Ljava/lang/Object;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/message/MessageContentsList", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 12);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
