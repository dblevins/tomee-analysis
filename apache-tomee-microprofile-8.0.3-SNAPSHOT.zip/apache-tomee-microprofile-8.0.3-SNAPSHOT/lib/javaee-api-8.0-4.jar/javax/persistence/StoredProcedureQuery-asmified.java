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
public class StoredProcedureQueryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "javax/persistence/StoredProcedureQuery", null, "java/lang/Object", new String[] { "javax/persistence/Query" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setHint", "(Ljava/lang/String;Ljava/lang/Object;)Ljavax/persistence/StoredProcedureQuery;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setParameter", "(Ljavax/persistence/Parameter;Ljava/lang/Object;)Ljavax/persistence/StoredProcedureQuery;", "<T:Ljava/lang/Object;>(Ljavax/persistence/Parameter<TT;>;TT;)Ljavax/persistence/StoredProcedureQuery;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setParameter", "(Ljavax/persistence/Parameter;Ljava/util/Calendar;Ljavax/persistence/TemporalType;)Ljavax/persistence/StoredProcedureQuery;", "(Ljavax/persistence/Parameter<Ljava/util/Calendar;>;Ljava/util/Calendar;Ljavax/persistence/TemporalType;)Ljavax/persistence/StoredProcedureQuery;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setParameter", "(Ljavax/persistence/Parameter;Ljava/util/Date;Ljavax/persistence/TemporalType;)Ljavax/persistence/StoredProcedureQuery;", "(Ljavax/persistence/Parameter<Ljava/util/Date;>;Ljava/util/Date;Ljavax/persistence/TemporalType;)Ljavax/persistence/StoredProcedureQuery;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setParameter", "(Ljava/lang/String;Ljava/lang/Object;)Ljavax/persistence/StoredProcedureQuery;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setParameter", "(Ljava/lang/String;Ljava/util/Calendar;Ljavax/persistence/TemporalType;)Ljavax/persistence/StoredProcedureQuery;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setParameter", "(Ljava/lang/String;Ljava/util/Date;Ljavax/persistence/TemporalType;)Ljavax/persistence/StoredProcedureQuery;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setParameter", "(ILjava/lang/Object;)Ljavax/persistence/StoredProcedureQuery;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setParameter", "(ILjava/util/Calendar;Ljavax/persistence/TemporalType;)Ljavax/persistence/StoredProcedureQuery;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setParameter", "(ILjava/util/Date;Ljavax/persistence/TemporalType;)Ljavax/persistence/StoredProcedureQuery;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setFlushMode", "(Ljavax/persistence/FlushModeType;)Ljavax/persistence/StoredProcedureQuery;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "registerStoredProcedureParameter", "(ILjava/lang/Class;Ljavax/persistence/ParameterMode;)Ljavax/persistence/StoredProcedureQuery;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "registerStoredProcedureParameter", "(Ljava/lang/String;Ljava/lang/Class;Ljavax/persistence/ParameterMode;)Ljavax/persistence/StoredProcedureQuery;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getOutputParameterValue", "(I)Ljava/lang/Object;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getOutputParameterValue", "(Ljava/lang/String;)Ljava/lang/Object;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "execute", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "executeUpdate", "()I", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getResultList", "()Ljava/util/List;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSingleResult", "()Ljava/lang/Object;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "hasMoreResults", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getUpdateCount", "()I", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "setFlushMode", "(Ljavax/persistence/FlushModeType;)Ljavax/persistence/Query;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/StoredProcedureQuery", "setFlushMode", "(Ljavax/persistence/FlushModeType;)Ljavax/persistence/StoredProcedureQuery;", true);
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
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/StoredProcedureQuery", "setParameter", "(ILjava/util/Date;Ljavax/persistence/TemporalType;)Ljavax/persistence/StoredProcedureQuery;", true);
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
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/StoredProcedureQuery", "setParameter", "(ILjava/util/Calendar;Ljavax/persistence/TemporalType;)Ljavax/persistence/StoredProcedureQuery;", true);
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
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/StoredProcedureQuery", "setParameter", "(ILjava/lang/Object;)Ljavax/persistence/StoredProcedureQuery;", true);
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
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/StoredProcedureQuery", "setParameter", "(Ljava/lang/String;Ljava/util/Date;Ljavax/persistence/TemporalType;)Ljavax/persistence/StoredProcedureQuery;", true);
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
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/StoredProcedureQuery", "setParameter", "(Ljava/lang/String;Ljava/util/Calendar;Ljavax/persistence/TemporalType;)Ljavax/persistence/StoredProcedureQuery;", true);
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
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/StoredProcedureQuery", "setParameter", "(Ljava/lang/String;Ljava/lang/Object;)Ljavax/persistence/StoredProcedureQuery;", true);
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
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/StoredProcedureQuery", "setParameter", "(Ljavax/persistence/Parameter;Ljava/util/Date;Ljavax/persistence/TemporalType;)Ljavax/persistence/StoredProcedureQuery;", true);
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
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/StoredProcedureQuery", "setParameter", "(Ljavax/persistence/Parameter;Ljava/util/Calendar;Ljavax/persistence/TemporalType;)Ljavax/persistence/StoredProcedureQuery;", true);
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
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/StoredProcedureQuery", "setParameter", "(Ljavax/persistence/Parameter;Ljava/lang/Object;)Ljavax/persistence/StoredProcedureQuery;", true);
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
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/StoredProcedureQuery", "setHint", "(Ljava/lang/String;Ljava/lang/Object;)Ljavax/persistence/StoredProcedureQuery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
