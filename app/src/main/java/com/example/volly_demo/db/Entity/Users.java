package com.example.volly_demo.db.Entity;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "users", indices = @Index(value = {"id"}, unique = true))
public class Users  implements Serializable {

        @PrimaryKey(autoGenerate = true)
        int id;

        @ColumnInfo(name = "login")
        String login;

        @ColumnInfo(name = "node_id")
        String node_id;

        @ColumnInfo(name = "avatar_url")
        String avatar_url;

        @ColumnInfo(name = "gravatar_id")
        String gravatar_id;

        @ColumnInfo(name = "url")
        String url;

        @ColumnInfo(name = "html_url")
        String html_url;


        @ColumnInfo(name = "followers_url")
        String followers_url;


        @ColumnInfo(name = "following_url")
        String following_url;


        @ColumnInfo(name = "gists_url")
        String gists_url;


        @ColumnInfo(name = "starred_url")
        String starred_url;



        @ColumnInfo(name = "subscriptions_url")
        String subscriptions_url;


        @ColumnInfo(name = "organizations_url")
        String organizations_url;


        @ColumnInfo(name = "repos_url")
        String repos_url;

        public String getEvents_url() {
                return events_url;
        }

        public void setEvents_url(String events_url) {
                this.events_url = events_url;
        }

        @ColumnInfo(name="events_url")
        String events_url;

        @ColumnInfo(name = "received_events_url")
        String received_events_url;

        @ColumnInfo(name = "type")
        String type;

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getLogin() {
                return login;
        }

        public void setLogin(String login) {
                this.login = login;
        }

        public String getNode_id() {
                return node_id;
        }

        public void setNode_id(String node_id) {
                this.node_id = node_id;
        }

        public String getAvatar_url() {
                return avatar_url;
        }

        public void setAvatar_url(String avatar_url) {
                this.avatar_url = avatar_url;
        }

        public String getGravatar_id() {
                return gravatar_id;
        }

        public void setGravatar_id(String gravatar_id) {
                this.gravatar_id = gravatar_id;
        }

        public String getUrl() {
                return url;
        }

        public void setUrl(String url) {
                this.url = url;
        }

        public String getHtml_url() {
                return html_url;
        }

        public void setHtml_url(String html_url) {
                this.html_url = html_url;
        }

        public String getFollowers_url() {
                return followers_url;
        }

        public void setFollowers_url(String followers_url) {
                this.followers_url = followers_url;
        }

        public String getFollowing_url() {
                return following_url;
        }

        public void setFollowing_url(String following_url) {
                this.following_url = following_url;
        }

        public String getGists_url() {
                return gists_url;
        }

        public void setGists_url(String gists_url) {
                this.gists_url = gists_url;
        }

        public String getStarred_url() {
                return starred_url;
        }

        public void setStarred_url(String starred_url) {
                this.starred_url = starred_url;
        }

        public String getSubscriptions_url() {
                return subscriptions_url;
        }

        public void setSubscriptions_url(String subscriptions_url) {
                this.subscriptions_url = subscriptions_url;
        }

        public String getOrganizations_url() {
                return organizations_url;
        }

        public void setOrganizations_url(String organizations_url) {
                this.organizations_url = organizations_url;
        }

        public String getRepos_url() {
                return repos_url;
        }

        public void setRepos_url(String repos_url) {
                this.repos_url = repos_url;
        }

        public String getReceived_events_url() {
                return received_events_url;
        }

        public void setReceived_events_url(String received_events_url) {
                this.received_events_url = received_events_url;
        }

        public String getType() {
                return type;
        }

        public void setType(String type) {
                this.type = type;
        }

        public String getSite_admin() {
                return site_admin;
        }

        public void setSite_admin(String site_admin) {
                this.site_admin = site_admin;
        }

        @ColumnInfo(name = "site_admin")
        String site_admin;

}
