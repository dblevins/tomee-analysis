package asm.jakarta.faces.model;
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
public class ResultSetDataModel$WrapResultSetEntriesIteratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "jakarta/faces/model/ResultSetDataModel$WrapResultSetEntriesIterator", "Ljava/lang/Object;Ljava/util/Iterator<Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/Object;>;>;", "java/lang/Object", new String[] { "java/util/Iterator" });

classWriter.visitInnerClass("jakarta/faces/model/ResultSetDataModel$WrapResultSetMap", "jakarta/faces/model/ResultSetDataModel", "WrapResultSetMap", ACC_PRIVATE);

classWriter.visitInnerClass("jakarta/faces/model/ResultSetDataModel$WrapResultSetEntriesIterator", "jakarta/faces/model/ResultSetDataModel", "WrapResultSetEntriesIterator", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("jakarta/faces/model/ResultSetDataModel$WrapResultSetEntry", "jakarta/faces/model/ResultSetDataModel", "WrapResultSetEntry", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_wrapMap", "Ljakarta/faces/model/ResultSetDataModel$WrapResultSetMap;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_keyIterator", "Ljava/util/Iterator;", "Ljava/util/Iterator<Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/faces/model/ResultSetDataModel$WrapResultSetMap;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/faces/model/ResultSetDataModel$WrapResultSetEntriesIterator", "_wrapMap", "Ljakarta/faces/model/ResultSetDataModel$WrapResultSetMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/faces/model/ResultSetDataModel$WrapResultSetEntriesIterator", "_keyIterator", "Ljava/util/Iterator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/faces/model/ResultSetDataModel$WrapResultSetEntriesIterator", "_wrapMap", "Ljakarta/faces/model/ResultSetDataModel$WrapResultSetMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/faces/model/ResultSetDataModel$WrapResultSetEntriesIterator", "_wrapMap", "Ljakarta/faces/model/ResultSetDataModel$WrapResultSetMap;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/model/ResultSetDataModel$WrapResultSetMap", "keySet", "()Ljava/util/Set;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/faces/model/ResultSetDataModel$WrapResultSetEntriesIterator", "_keyIterator", "Ljava/util/Iterator;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasNext", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/faces/model/ResultSetDataModel$WrapResultSetEntriesIterator", "_keyIterator", "Ljava/util/Iterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Ljava/util/Map$Entry;", "()Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/Object;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/model/ResultSetDataModel$WrapResultSetEntry");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/faces/model/ResultSetDataModel$WrapResultSetEntriesIterator", "_wrapMap", "Ljakarta/faces/model/ResultSetDataModel$WrapResultSetMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/faces/model/ResultSetDataModel$WrapResultSetEntriesIterator", "_keyIterator", "Ljava/util/Iterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/model/ResultSetDataModel$WrapResultSetEntry", "<init>", "(Ljakarta/faces/model/ResultSetDataModel$WrapResultSetMap;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("It is not allowed to remove from this iterator");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "next", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/model/ResultSetDataModel$WrapResultSetEntriesIterator", "next", "()Ljava/util/Map$Entry;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
