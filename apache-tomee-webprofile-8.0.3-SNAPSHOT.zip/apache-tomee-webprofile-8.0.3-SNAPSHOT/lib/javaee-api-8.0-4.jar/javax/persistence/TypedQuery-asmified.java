package asm.javax.persistence;
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
public class TypedQueryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "javax/persistence/TypedQuery", "<X:Ljava/lang/Object;>Ljava/lang/Object;Ljavax/persistence/Query;", "java/lang/Object", new String[] { "javax/persistence/Query" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getResultList", "()Ljava/util/List;", "()Ljava/util/List<TX;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSingleResult", "()Ljava/lang/Object;", "()TX;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setMaxResults", "(I)Ljavax/persistence/TypedQuery;", "(I)Ljavax/persistence/TypedQuery<TX;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setFirstResult", "(I)Ljavax/persistence/TypedQuery;", "(I)Ljavax/persistence/TypedQuery<TX;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setHint", "(Ljava/lang/String;Ljava/lang/Object;)Ljavax/persistence/TypedQuery;", "(Ljava/lang/String;Ljava/lang/Object;)Ljavax/persistence/TypedQuery<TX;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setParameter", "(Ljavax/persistence/Parameter;Ljava/lang/Object;)Ljavax/persistence/TypedQuery;", "<T:Ljava/lang/Object;>(Ljavax/persistence/Parameter<TT;>;TT;)Ljavax/persistence/TypedQuery<TX;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setParameter", "(Ljavax/persistence/Parameter;Ljava/util/Calendar;Ljavax/persistence/TemporalType;)Ljavax/persistence/TypedQuery;", "(Ljavax/persistence/Parameter<Ljava/util/Calendar;>;Ljava/util/Calendar;Ljavax/persistence/TemporalType;)Ljavax/persistence/TypedQuery<TX;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setParameter", "(Ljavax/persistence/Parameter;Ljava/util/Date;Ljavax/persistence/TemporalType;)Ljavax/persistence/TypedQuery;", "(Ljavax/persistence/Parameter<Ljava/util/Date;>;Ljava/util/Date;Ljavax/persistence/TemporalType;)Ljavax/persistence/TypedQuery<TX;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setParameter", "(Ljava/lang/String;Ljava/lang/Object;)Ljavax/persistence/TypedQuery;", "(Ljava/lang/String;Ljava/lang/Object;)Ljavax/persistence/TypedQuery<TX;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setParameter", "(Ljava/lang/String;Ljava/util/Calendar;Ljavax/persistence/TemporalType;)Ljavax/persistence/TypedQuery;", "(Ljava/lang/String;Ljava/util/Calendar;Ljavax/persistence/TemporalType;)Ljavax/persistence/TypedQuery<TX;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setParameter", "(Ljava/lang/String;Ljava/util/Date;Ljavax/persistence/TemporalType;)Ljavax/persistence/TypedQuery;", "(Ljava/lang/String;Ljava/util/Date;Ljavax/persistence/TemporalType;)Ljavax/persistence/TypedQuery<TX;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setParameter", "(ILjava/lang/Object;)Ljavax/persistence/TypedQuery;", "(ILjava/lang/Object;)Ljavax/persistence/TypedQuery<TX;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setParameter", "(ILjava/util/Calendar;Ljavax/persistence/TemporalType;)Ljavax/persistence/TypedQuery;", "(ILjava/util/Calendar;Ljavax/persistence/TemporalType;)Ljavax/persistence/TypedQuery<TX;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setParameter", "(ILjava/util/Date;Ljavax/persistence/TemporalType;)Ljavax/persistence/TypedQuery;", "(ILjava/util/Date;Ljavax/persistence/TemporalType;)Ljavax/persistence/TypedQuery<TX;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setFlushMode", "(Ljavax/persistence/FlushModeType;)Ljavax/persistence/TypedQuery;", "(Ljavax/persistence/FlushModeType;)Ljavax/persistence/TypedQuery<TX;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setLockMode", "(Ljavax/persistence/LockModeType;)Ljavax/persistence/TypedQuery;", "(Ljavax/persistence/LockModeType;)Ljavax/persistence/TypedQuery<TX;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getResultStream", "()Ljava/util/stream/Stream;", "()Ljava/util/stream/Stream<TX;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/TypedQuery", "getResultList", "()Ljava/util/List;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "stream", "()Ljava/util/stream/Stream;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "setLockMode", "(Ljavax/persistence/LockModeType;)Ljavax/persistence/Query;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/TypedQuery", "setLockMode", "(Ljavax/persistence/LockModeType;)Ljavax/persistence/TypedQuery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "setFlushMode", "(Ljavax/persistence/FlushModeType;)Ljavax/persistence/Query;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/TypedQuery", "setFlushMode", "(Ljavax/persistence/FlushModeType;)Ljavax/persistence/TypedQuery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "setParameter", "(ILjava/util/Date;Ljavax/persistence/TemporalType;)Ljavax/persistence/Query;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/TypedQuery", "setParameter", "(ILjava/util/Date;Ljavax/persistence/TemporalType;)Ljavax/persistence/TypedQuery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "setParameter", "(ILjava/util/Calendar;Ljavax/persistence/TemporalType;)Ljavax/persistence/Query;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/TypedQuery", "setParameter", "(ILjava/util/Calendar;Ljavax/persistence/TemporalType;)Ljavax/persistence/TypedQuery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "setParameter", "(ILjava/lang/Object;)Ljavax/persistence/Query;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/TypedQuery", "setParameter", "(ILjava/lang/Object;)Ljavax/persistence/TypedQuery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "setParameter", "(Ljava/lang/String;Ljava/util/Date;Ljavax/persistence/TemporalType;)Ljavax/persistence/Query;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/TypedQuery", "setParameter", "(Ljava/lang/String;Ljava/util/Date;Ljavax/persistence/TemporalType;)Ljavax/persistence/TypedQuery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "setParameter", "(Ljava/lang/String;Ljava/util/Calendar;Ljavax/persistence/TemporalType;)Ljavax/persistence/Query;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/TypedQuery", "setParameter", "(Ljava/lang/String;Ljava/util/Calendar;Ljavax/persistence/TemporalType;)Ljavax/persistence/TypedQuery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "setParameter", "(Ljava/lang/String;Ljava/lang/Object;)Ljavax/persistence/Query;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/TypedQuery", "setParameter", "(Ljava/lang/String;Ljava/lang/Object;)Ljavax/persistence/TypedQuery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "setParameter", "(Ljavax/persistence/Parameter;Ljava/util/Date;Ljavax/persistence/TemporalType;)Ljavax/persistence/Query;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/TypedQuery", "setParameter", "(Ljavax/persistence/Parameter;Ljava/util/Date;Ljavax/persistence/TemporalType;)Ljavax/persistence/TypedQuery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "setParameter", "(Ljavax/persistence/Parameter;Ljava/util/Calendar;Ljavax/persistence/TemporalType;)Ljavax/persistence/Query;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/TypedQuery", "setParameter", "(Ljavax/persistence/Parameter;Ljava/util/Calendar;Ljavax/persistence/TemporalType;)Ljavax/persistence/TypedQuery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "setParameter", "(Ljavax/persistence/Parameter;Ljava/lang/Object;)Ljavax/persistence/Query;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/TypedQuery", "setParameter", "(Ljavax/persistence/Parameter;Ljava/lang/Object;)Ljavax/persistence/TypedQuery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "setHint", "(Ljava/lang/String;Ljava/lang/Object;)Ljavax/persistence/Query;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/TypedQuery", "setHint", "(Ljava/lang/String;Ljava/lang/Object;)Ljavax/persistence/TypedQuery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "setFirstResult", "(I)Ljavax/persistence/Query;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/TypedQuery", "setFirstResult", "(I)Ljavax/persistence/TypedQuery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "setMaxResults", "(I)Ljavax/persistence/Query;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/TypedQuery", "setMaxResults", "(I)Ljavax/persistence/TypedQuery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
