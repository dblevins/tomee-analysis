package asm.org.eclipse.persistence.platform.database.oracle.dcn;
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
public class OracleChangeNotificationListener$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/persistence/platform/database/oracle/dcn/OracleChangeNotificationListener$1", null, "java/lang/Object", new String[] { "oracle/jdbc/dcn/DatabaseChangeListener" });

classWriter.visitOuterClass("org/eclipse/persistence/platform/database/oracle/dcn/OracleChangeNotificationListener", "register", "(Lorg/eclipse/persistence/sessions/Session;)V");

classWriter.visitInnerClass("org/eclipse/persistence/platform/database/oracle/dcn/OracleChangeNotificationListener$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/eclipse/persistence/platform/database/oracle/dcn/OracleChangeNotificationListener;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_SYNTHETIC, "val$databaseSession", "Lorg/eclipse/persistence/internal/sessions/AbstractSession;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_SYNTHETIC, "val$fields", "Ljava/util/List;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/eclipse/persistence/platform/database/oracle/dcn/OracleChangeNotificationListener;Lorg/eclipse/persistence/internal/sessions/AbstractSession;Ljava/util/List;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/platform/database/oracle/dcn/OracleChangeNotificationListener$1", "this$0", "Lorg/eclipse/persistence/platform/database/oracle/dcn/OracleChangeNotificationListener;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/platform/database/oracle/dcn/OracleChangeNotificationListener$1", "val$databaseSession", "Lorg/eclipse/persistence/internal/sessions/AbstractSession;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/platform/database/oracle/dcn/OracleChangeNotificationListener$1", "val$fields", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "onDatabaseChangeNotification", "(Loracle/jdbc/dcn/DatabaseChangeEvent;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/database/oracle/dcn/OracleChangeNotificationListener$1", "val$databaseSession", "Lorg/eclipse/persistence/internal/sessions/AbstractSession;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("connection");
methodVisitor.visitLdcInsn("dcn_change_event");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/AbstractSession", "log", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "oracle/jdbc/dcn/DatabaseChangeEvent", "getTableChangeDescription", "()[Loracle/jdbc/dcn/TableChangeDescription;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "oracle/jdbc/dcn/DatabaseChangeEvent", "getTableChangeDescription", "()[Loracle/jdbc/dcn/TableChangeDescription;", false);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/eclipse/persistence/platform/database/oracle/dcn/OracleChangeNotificationListener$1", "oracle/jdbc/dcn/DatabaseChangeEvent", Opcodes.TOP, Opcodes.INTEGER, Opcodes.INTEGER, "[Loracle/jdbc/dcn/TableChangeDescription;"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/database/oracle/dcn/OracleChangeNotificationListener$1", "this$0", "Lorg/eclipse/persistence/platform/database/oracle/dcn/OracleChangeNotificationListener;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/database/oracle/dcn/OracleChangeNotificationListener", "descriptorsByTable", "Ljava/util/Map;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/helper/DatabaseTable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "oracle/jdbc/dcn/TableChangeDescription", "getTableName", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/helper/DatabaseTable", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/descriptors/ClassDescriptor");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/ClassDescriptor", "getCachePolicy", "()Lorg/eclipse/persistence/descriptors/CachePolicy;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/database/oracle/dcn/OracleChangeNotificationListener$1", "val$fields", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/CachePolicy", "getCacheIndex", "(Ljava/util/List;)Lorg/eclipse/persistence/descriptors/CacheIndex;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "oracle/jdbc/dcn/TableChangeDescription", "getRowChangeDescription", "()[Loracle/jdbc/dcn/RowChangeDescription;", true);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 10);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 9);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
Label label5 = new Label();
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 12, new Object[] {"org/eclipse/persistence/platform/database/oracle/dcn/OracleChangeNotificationListener$1", "oracle/jdbc/dcn/DatabaseChangeEvent", "oracle/jdbc/dcn/TableChangeDescription", Opcodes.INTEGER, Opcodes.INTEGER, "[Loracle/jdbc/dcn/TableChangeDescription;", "org/eclipse/persistence/descriptors/ClassDescriptor", "org/eclipse/persistence/descriptors/CacheIndex", Opcodes.TOP, Opcodes.INTEGER, Opcodes.INTEGER, "[Loracle/jdbc/dcn/RowChangeDescription;"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/identitymaps/CacheId");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "oracle/jdbc/dcn/RowChangeDescription", "getRowid", "()Loracle/sql/ROWID;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "oracle/sql/ROWID", "stringValue", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/identitymaps/CacheId", "<init>", "([Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/database/oracle/dcn/OracleChangeNotificationListener$1", "val$databaseSession", "Lorg/eclipse/persistence/internal/sessions/AbstractSession;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/AbstractSession", "getIdentityMapAccessorInstance", "()Lorg/eclipse/persistence/internal/sessions/IdentityMapAccessor;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/IdentityMapAccessor", "getIdentityMapManager", "()Lorg/eclipse/persistence/internal/identitymaps/IdentityMapManager;", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/identitymaps/IdentityMapManager", "getCacheKeyByIndex", "(Lorg/eclipse/persistence/descriptors/CacheIndex;Lorg/eclipse/persistence/internal/identitymaps/CacheId;ZLorg/eclipse/persistence/descriptors/ClassDescriptor;)Lorg/eclipse/persistence/internal/identitymaps/CacheKey;", false);
methodVisitor.visitVarInsn(ASTORE, 13);
methodVisitor.visitVarInsn(ALOAD, 13);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/identitymaps/CacheKey", "getTransactionId", "()Ljava/lang/Object;", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/identitymaps/CacheKey", "getTransactionId", "()Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "oracle/jdbc/dcn/DatabaseChangeEvent", "getTransactionId", "(Z)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label6);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_FULL, 14, new Object[] {"org/eclipse/persistence/platform/database/oracle/dcn/OracleChangeNotificationListener$1", "oracle/jdbc/dcn/DatabaseChangeEvent", "oracle/jdbc/dcn/TableChangeDescription", Opcodes.INTEGER, Opcodes.INTEGER, "[Loracle/jdbc/dcn/TableChangeDescription;", "org/eclipse/persistence/descriptors/ClassDescriptor", "org/eclipse/persistence/descriptors/CacheIndex", "oracle/jdbc/dcn/RowChangeDescription", Opcodes.INTEGER, Opcodes.INTEGER, "[Loracle/jdbc/dcn/RowChangeDescription;", "org/eclipse/persistence/internal/identitymaps/CacheId", "org/eclipse/persistence/internal/identitymaps/CacheKey"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/database/oracle/dcn/OracleChangeNotificationListener$1", "val$databaseSession", "Lorg/eclipse/persistence/internal/sessions/AbstractSession;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("connection");
methodVisitor.visitLdcInsn("dcn_invalidate");
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/identitymaps/CacheKey", "getKey", "()Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/ClassDescriptor", "getJavaClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/AbstractSession", "log", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/identitymaps/CacheKey", "setInvalidationState", "(I)V", false);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_FULL, 12, new Object[] {"org/eclipse/persistence/platform/database/oracle/dcn/OracleChangeNotificationListener$1", "oracle/jdbc/dcn/DatabaseChangeEvent", "oracle/jdbc/dcn/TableChangeDescription", Opcodes.INTEGER, Opcodes.INTEGER, "[Loracle/jdbc/dcn/TableChangeDescription;", "org/eclipse/persistence/descriptors/ClassDescriptor", "org/eclipse/persistence/descriptors/CacheIndex", Opcodes.TOP, Opcodes.INTEGER, Opcodes.INTEGER, "[Loracle/jdbc/dcn/RowChangeDescription;"}, 0, new Object[] {});
methodVisitor.visitIincInsn(9, 1);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitVarInsn(ILOAD, 10);
methodVisitor.visitJumpInsn(IF_ICMPLT, label5);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/eclipse/persistence/platform/database/oracle/dcn/OracleChangeNotificationListener$1", "oracle/jdbc/dcn/DatabaseChangeEvent", Opcodes.TOP, Opcodes.INTEGER, Opcodes.INTEGER, "[Loracle/jdbc/dcn/TableChangeDescription;"}, 0, new Object[] {});
methodVisitor.visitIincInsn(3, 1);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitJumpInsn(IF_ICMPLT, label2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/eclipse/persistence/platform/database/oracle/dcn/OracleChangeNotificationListener$1", "oracle/jdbc/dcn/DatabaseChangeEvent"}, 0, new Object[] {});
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 14);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
